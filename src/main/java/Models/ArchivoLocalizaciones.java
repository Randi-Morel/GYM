package Models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoLocalizaciones {
    private static final String RUTA_ARCHIVO = "src/main/java/Models/localizaciones.txt";
    
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
            System.out.println("❌ Error al leer archivo de localizaciones: " + e.getMessage());
        }

        return lineas;
    }
    
    public void guardarOEditarPorID(String nuevaLinea, String idBuscado) {
        File archivoOriginal = new File(RUTA_ARCHIVO);
        File archivoTemporal = new File("src/main/java/Models/temp_localizaciones.txt");

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
    public void eliminarPorID(String idEliminar) {
        File archivoOriginal = new File(RUTA_ARCHIVO);
        File archivoTemporal = new File("src/main/java/Models/temp_localizaciones.txt");

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
            System.out.println("Error al eliminar localizacion: " + e.getMessage());
            return;
        }

        // Reemplazar archivo
        if (archivoOriginal.delete()) {
            archivoTemporal.renameTo(archivoOriginal);
        }
    }
    
    public String buscarPorID(String idBuscado) {
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);

                if (partes.length >= 1 && partes[0].trim().equals(idBuscado.trim())) {
                    return linea;
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al buscar localizacion: " + e.getMessage());
        }
        return null;
    }
}
