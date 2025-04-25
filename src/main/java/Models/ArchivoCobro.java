package Models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoCobro {
    private static final String RUTA_ARCHIVO = "src/main/java/Models/cobro.txt";
    
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
    
    public void guardarLineaNueva(String linea) {
        File archivo = new File(RUTA_ARCHIVO);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("❌ Error al guardar línea nueva: " + e.getMessage());
        }
    }
    
    public boolean existeCobroParaFecha(String fechaBuscada) {
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 2 && partes[1].trim().equals(fechaBuscada)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al verificar cobros: " + e.getMessage());
        }
        return false;
    }
    
    public boolean existeCobroConCliente(String idCliente) {
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 3 && partes[2].trim().equals(idCliente.trim())) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error al verificar cobro: " + e.getMessage());
        }
        return false;
    }
    
    public int obtenerUltimoID() {
    int ultimoID = 0;
    try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(";", -1);
            if (partes.length > 0) {
                try {
                    int id = Integer.parseInt(partes[0].trim());
                    if (id > ultimoID) {
                        ultimoID = id;
                    }
                } catch (NumberFormatException ignored) {}
            }
        }
    } catch (IOException e) {
        System.out.println("❌ Error al leer archivo de cobros: " + e.getMessage());
    }
    return ultimoID;
}
    
}
