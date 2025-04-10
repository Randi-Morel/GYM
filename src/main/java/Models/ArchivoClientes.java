package Models;

import java.io.*;

public class ArchivoClientes {
    private static final String RUTA_ARCHIVO = "src/main/java/Models/clientes.txt";
    
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
    
    // 3. Eliminar la línea que contenga el ID al inicio (ej: 2)
    public void eliminarPorIDEntrenador(String idEntrenadorEliminar) {
        File archivoOriginal = new File(RUTA_ARCHIVO);
        File archivoTemporal = new File("src/main/java/Models/temp_clientes.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);

                if (!partes[0].trim().equals(idEntrenadorEliminar.trim())) {
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
    
    public String buscarPorIDEntrenador(String idBuscado) {
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
