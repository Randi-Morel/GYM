package Models;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ArchivoEncabezadoCuota {
    private static final String RUTA_ARCHIVO = "src/main/java/Models/encabezadoCuota.txt";
    
    public void guardarOEditarPorID(String nuevaLinea, String idBuscado) {
        File archivoOriginal = new File(RUTA_ARCHIVO);
        File archivoTemporal = new File("src/main/java/Models/temp_encabezadoCuota.txt");

        boolean actualizado = false;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 1 && partes[0].trim().equals(idBuscado.trim())) {
                    bw.write(nuevaLinea);
                    actualizado = true;
                } else {
                    bw.write(linea);
                }
                bw.newLine();
            }

            if (!actualizado) {
                bw.write(nuevaLinea);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("❌ Error al guardar o editar cuota: " + e.getMessage());
            return;
        }

        if (archivoOriginal.delete()) {
            archivoTemporal.renameTo(archivoOriginal);
        }
    }
    
    public String buscarPorID(String idBuscado) {
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 5 && partes[0].trim().equals(idBuscado.trim())) {
                    return linea;
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al buscar cuota: " + e.getMessage());
        }
        return null;
    }
    
    public int obtenerProximoID() {
        int ultimoID = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 1) {
                    try {
                        int idActual = Integer.parseInt(partes[0].trim());
                        if (idActual > ultimoID) {
                            ultimoID = idActual;
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("⚠️ Error leyendo encabezadoCuota.txt: " + e.getMessage());
        }

        return ultimoID + 1;
    }
    
    public List<String> marcarCobradosYDevolverRegistros(Date inicio, Date fin) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        List<String> cobrados = new ArrayList<>();

        File original = new File(RUTA_ARCHIVO);
        File temp = new File("src/main/java/Models/temp_encabezadoCuota.txt");

        try (
            BufferedReader br = new BufferedReader(new FileReader(original));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp))
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 5) {
                    String fechaStr = partes[1].trim();
                    String estado = partes[4].trim().toLowerCase();

                    Date fecha = formato.parse(fechaStr);
                    if (!fecha.before(inicio) && !fecha.after(fin) && estado.equals("false")) {
                        partes[4] = "true";
                        cobrados.add(String.join(";", partes)); // agregar al resultado
                        linea = String.join(";", partes);
                    }
                }
                bw.write(linea);
                bw.newLine();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "❌ Error en actualización: " + e.getMessage());
        }

        if (original.delete()) {
            temp.renameTo(original);
        }

        return cobrados;
    }
}
