package Models;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Locale;
import javax.swing.JOptionPane;

public class ArchivoClientes {
    private static final String RUTA_ARCHIVO = "src/main/java/Models/clientes.txt";
    
    public List<String> leerTodo() {
        List<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    lineas.add(linea.trim());
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al leer archivo de clientes: " + e.getMessage());
        }

        return lineas;
    }
    
    public void guardarOEditarPorID(String nuevaLinea, String idBuscado) {
        File archivoOriginal = new File(RUTA_ARCHIVO);
        File archivoTemporal = new File("src/main/java/Models/temp_clientes.txt");

        boolean actualizado = false;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1); // incluir campos vacíos
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
            System.out.println("Error al guardar o editar: " + e.getMessage());
            return;
        }

        if (archivoOriginal.delete()) {
            archivoTemporal.renameTo(archivoOriginal);
        }
    }
    
    public void actualizarBalances(List<String> cobros) {
        File archivoOriginal = new File(RUTA_ARCHIVO);
        File archivoTemporal = new File("src/main/java/Models/temp_clientes.txt");

        Map<String, Double> cobrosPorCliente = new HashMap<>();

        for (String linea : cobros) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 4) {
                String idCliente = partes[2];
                double valor = Double.parseDouble(partes[3]);
                cobrosPorCliente.put(idCliente, cobrosPorCliente.getOrDefault(idCliente, 0.0) + valor);
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 12) {
                    String idCliente = partes[0].trim();
                    if (cobrosPorCliente.containsKey(idCliente)) {
                        double balanceActual = 0.0;
                        try {
                            balanceActual = Double.parseDouble(partes[10]);
                        } catch (NumberFormatException ignored) {}

                        double nuevoBalance = balanceActual + cobrosPorCliente.get(idCliente);
                        partes[10] = String.format("%.2f", nuevoBalance);
                    }
                    bw.write(String.join(";", partes));
                    bw.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("❌ Error al actualizar balances: " + e.getMessage());
            return;
        }

        if (archivoOriginal.delete()) {
            archivoTemporal.renameTo(archivoOriginal);
        }
    }
    
    public void actualizarBalancesDesdeRegistros(List<String> registrosCuota) {
        File original = new File(RUTA_ARCHIVO);
        File temp = new File("src/main/java/Models/temp_clientes.txt");

        try (
            BufferedReader br = new BufferedReader(new FileReader(original));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp))
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 14) {
                    String idCliente = partes[0].trim();

                    for (String cuota : registrosCuota) {
                        String[] datos = cuota.split(";", -1);
                        if (datos.length >= 4 && datos[2].trim().equals(idCliente)) {
                            double balance = Double.parseDouble(partes[10].trim());
                            double valor = Double.parseDouble(datos[3].trim());

                            double nuevoBalance = balance - valor;
                            partes[10] = String.format(Locale.US, "%.2f", nuevoBalance);
                            break;
                        }
                    }
                }

                bw.write(String.join(";", partes));
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "❌ Error al actualizar clientes: " + e.getMessage());
        }

        if (original.delete()) {
            temp.renameTo(original);
        }
    }

    
    // 3. Eliminar la línea que contenga el ID al inicio (ej: 2)
    public void eliminarPorID(String idEliminar) {
        File archivoOriginal = new File(RUTA_ARCHIVO);
        File archivoTemporal = new File("src/main/java/Models/temp_clientes.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);

                if (!partes[0].trim().equals(idEliminar.trim())) {
                    bw.write(linea);
                    bw.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
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

                if (partes.length >= 3 && partes[0].trim().equals(idBuscado.trim())) {
                    return linea;
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al buscar cliente: " + e.getMessage());
        }
        return null;
    }
}
