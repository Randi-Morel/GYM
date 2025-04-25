package Models;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    
    //ELIMINAR ESTO
    public void marcarCobrosComoCobrados(Set<String> idsCobro) {
        List<String> nuevasLineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 6 && idsCobro.contains(partes[0].trim())) {
                    partes[5] = "true"; // marcar como cobrado  !PENDIENTE DE REVISION, ESTO FUNCIONA, PERO SE PUEDE MEJORAR
                    linea = String.join(";", partes);
                }
                nuevasLineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("❌ Error al actualizar cobros: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (String l : nuevasLineas) {
                bw.write(l);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("❌ Error al guardar cobros actualizados: " + e.getMessage());
        }
    }
    
    public void marcarCobrosComoCobradosDesdeCuotas(List<String> registrosCuotaCobradas) {
        // Paso 1: Obtener todos los ID_Cuota cobrados
        Set<String> idsCuotaCobradas = new HashSet<>();
        for (String linea : registrosCuotaCobradas) {
            String[] partes = linea.split(";", -1);
            if (partes.length >= 1) {
                idsCuotaCobradas.add(partes[0].trim());
            }
        }

        // Paso 2: Buscar los ID_Cobro relacionados en detalle.txt
        Set<String> idsCobro = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Models/detalleCuota.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 5) {
                    String idCuota = partes[0].trim();
                    String idCobro = partes[4].trim();

                    if (idsCuotaCobradas.contains(idCuota)) {
                        idsCobro.add(idCobro);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error leyendo detallecuota.txt: " + e.getMessage());
            return;
        }

        // Paso 3: Actualizar cobro.txt marcando esos ID_Cobro como true
        List<String> nuevasLineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Models/cobro.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length >= 6 && idsCobro.contains(partes[0].trim())) {
                    partes[5] = "true";  // Marcar como cobrado
                    linea = String.join(";", partes);
                }
                nuevasLineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("❌ Error leyendo cobro.txt: " + e.getMessage());
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/Models/cobro.txt"))) {
            for (String l : nuevasLineas) {
                bw.write(l);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("❌ Error escribiendo cobro.txt: " + e.getMessage());
        }

        System.out.println("✅ Cobros marcados como cobrados: " + idsCobro);
    }
}
