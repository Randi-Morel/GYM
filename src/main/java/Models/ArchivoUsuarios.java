package Models;

import java.io.*;
import java.util.*;

public class ArchivoUsuarios {
    private static final String RUTA_ARCHIVO = "src/main/java/Models/usuarios.txt";
    
    // 1. Leer todo el archivo y retornarlo como una lista de strings
    public List<String> leerTodo() {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return lineas;
    }
    
    // 2. Guardar en una nueva línea lo que se le pase (ej: "3;Pedro;pass789")
    public void guardarLinea(String nuevaLinea) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_ARCHIVO, true))) {
            bw.write(nuevaLinea);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    
    public void guardarOEditarPorID(String nuevaLinea, int idBuscado) {
        File archivoOriginal = new File(RUTA_ARCHIVO);
        File archivoTemporal = new File("src/main/java/Models/temp_usuarios.txt");

        boolean actualizado = false;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length >= 1 && partes[0].trim().equals(String.valueOf(idBuscado))) {
                    bw.write(nuevaLinea); // reemplaza línea
                    actualizado = true;
                } else {
                    bw.write(linea); // mantiene línea original
                }
                bw.newLine();
            }

            // Si no existía, lo agregamos al final
            if (!actualizado) {
                bw.write(nuevaLinea);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al guardar o editar: " + e.getMessage());
            return;
        }

        // Reemplazar archivo
        if (archivoOriginal.delete()) {
            archivoTemporal.renameTo(archivoOriginal);
        }
    }
    
    // 3. Eliminar la línea que contenga el ID al inicio (ej: 2)
    public void eliminarPorID(int idEliminar) {
        File archivoOriginal = new File(RUTA_ARCHIVO);
        File archivoTemporal = new File("src/main/java/Models/temp_usuarios.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (!partes[0].trim().equals(String.valueOf(idEliminar))) {
                    bw.write(linea);
                    bw.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
            return;
        }

        // Reemplazar archivo
        if (archivoOriginal.delete()) {
            archivoTemporal.renameTo(archivoOriginal);
        }
    }
    
    public String buscarPorID(int idBuscado) {
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length >= 6 && partes[0].trim().equals(String.valueOf(idBuscado))) {
                    return linea;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al buscar usuario: " + e.getMessage());
        }
        return null; // no encontrado
    }
}
