package Models;

public class FacturaData {
    private String idCliente;
    private String nombreCliente;
    private String correo;
    private String direccion;
    private String concepto;
    private String valor;
    private String fecha;
    private String idCobro;

    public FacturaData(String idCliente, String nombreCliente, String correo, String direccion, String concepto, String valor, String fecha, String idCobro) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.correo = correo;
        this.direccion = direccion;
        this.concepto = concepto;
        this.valor = valor;
        this.fecha = fecha;
        this.idCobro = idCobro;
    }

    public String getIdCliente() { return idCliente; }
    public String getNombreCliente() { return nombreCliente; }
    public String getCorreo() { return correo; }
    public String getDireccion() { return direccion; }
    public String getConcepto() { return concepto; }
    public String getValor() { return valor; }
    public String getFecha() { return fecha; }
    public String getIdCobro() { return idCobro; }
    
}