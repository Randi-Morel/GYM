package Models;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ArchivoDetalleCuota {
    private static final String RUTA_ARCHIVO = "src/main/java/Models/detalleCuota.txt";
    
    public void actualizarDetalleCuota(DefaultTableModel modelo, String idCuota) {
        File archivo = new File(RUTA_ARCHIVO);
        List<String> lineasExistentes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineasExistentes.add(linea);
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error al leer detalleCuota.txt: " + e.getMessage());
        }

        Set<String> combinacionesExistentes = new HashSet<>();
        for (String linea : lineasExistentes) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 5) {
                combinacionesExistentes.add(partes[0].trim() + "-" + partes[4].trim());
            }
        }

        List<String> nuevasLineas = new ArrayList<>();

        for (String linea : lineasExistentes) {
            if (!linea.startsWith(idCuota + ";")) {
                nuevasLineas.add(linea);
            }
        }

        for (int i = 0; i < modelo.getRowCount(); i++) {
            Boolean seleccionado = (Boolean) modelo.getValueAt(i, 5);
            String secuencia = modelo.getValueAt(i, 1).toString().trim();
            String concepto = modelo.getValueAt(i, 2).toString().trim();
            String valor = modelo.getValueAt(i, 3).toString().trim();
            String idCobro = modelo.getValueAt(i, 4).toString().trim();

            String clave = idCuota.trim() + "-" + idCobro;

            if (seleccionado != null && seleccionado) {
                if (!combinacionesExistentes.contains(clave)) {
                    String nuevaLinea = String.join(";", idCuota, secuencia, concepto, valor, idCobro);
                    nuevasLineas.add(nuevaLinea);
                } else {
                    for (String linea : lineasExistentes) {
                        if (linea.startsWith(idCuota + ";") && linea.endsWith(";" + idCobro)) {
                            nuevasLineas.add(linea);
                            break;
                        }
                    }
                }
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (String linea : nuevasLineas) {
                bw.write(linea);
                bw.newLine();
            }
            JOptionPane.showMessageDialog(null, "✅ Detalle de cuota actualizado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "❌ Error al actualizar detalle: " + e.getMessage());
        }
    }
    
    public Set<String> obtenerCobrosDeDetalle(String idCuota) {
        Set<String> cobrosMarcados = new HashSet<>();

        File archivo = new File(RUTA_ARCHIVO);
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 5 && partes[0].trim().equals(idCuota.trim())) {
                    cobrosMarcados.add(partes[4].trim()); // ID_Cobro
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer detalleCuota.txt: " + e.getMessage());
        }

        return cobrosMarcados;
    }
}
