package Models;

import java.io.FileOutputStream;
import java.io.IOException;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.util.List;
import javax.swing.JOptionPane;

public class FacturaPDFGenerator {
    
    public static void generarFacturaGlobal(List<FacturaData> datosFactura, String concepto) {
        try {
            // Carpeta de descargas del usuario
            String userHome = System.getProperty("user.home");
            String rutaDescargas = userHome + "/Downloads/";
            String nombreArchivo = rutaDescargas + concepto.replace(" ", "_") + ".pdf";

            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            documento.open();

            Font tituloFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
            Font normalFont = FontFactory.getFont(FontFactory.HELVETICA, 12);

            for (FacturaData data : datosFactura) {
                documento.add(new Paragraph("Factura de Membresía", tituloFont));
                documento.add(new Paragraph("Fecha de emisión: " + data.getFecha(), normalFont));
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("Datos del Cliente:", normalFont));
                documento.add(new Paragraph("Nombre: " + data.getNombreCliente(), normalFont));
                documento.add(new Paragraph("Correo: " + data.getCorreo(), normalFont));
                documento.add(new Paragraph("Dirección: " + data.getDireccion(), normalFont));
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("Detalles del Cobro:", normalFont));
                documento.add(new Paragraph("Concepto: " + data.getConcepto(), normalFont));
                documento.add(new Paragraph("Monto: RD$ " + data.getValor(), normalFont));
                documento.add(new Paragraph("ID de Cobro: " + data.getIdCobro(), normalFont));
                
                documento.newPage(); // Nueva página para el siguiente cliente
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "✅ Factura generada correctamente.\nUbicación: " + nombreArchivo);
            
            File archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                Desktop.getDesktop().open(archivo);
            } else {
                System.out.println("❌ No se encontró el archivo para abrir: " + nombreArchivo);
            }
        } catch (DocumentException | IOException e) {
            System.out.println("❌ Error al generar factura global: " + e.getMessage());
        }
    }
}