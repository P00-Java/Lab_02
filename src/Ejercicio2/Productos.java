package Ejercicio2;

public class Productos {
    private int codigo;
    private String descripcion;
    private int cantidad;
    private double precio_unitario;
    public Productos() {
        codigo = 125;
        descripcion = "Polo Lazo Crop Mujer";
        cantidad = 4;
        precio_unitario = 10.99;
    }
    public Productos(int cod, String desc, int cant, double p_u) {
        this.codigo = cod;
        this.descripcion = desc;
        this.cantidad = cant;
        this.precio_unitario = p_u;
    }
    //Get and set
    //CODIGO
    public void setCodigo(int cod) {
        codigo = cod;
    }
    public int getCodigo() {
        return codigo;
    }
    //DESCRIPCION
    public void setDescripcion(String desc) {
        descripcion = desc;
    }
    public String getDescripcion() {
        return descripcion;
    }
    //CANTIDAD
    public void setCantidad(int cant) {
        cantidad = cant;
    }
    public int getCantidad() {
        return cantidad;
    }
    //PRECIO-UNITARIO
    public void setPrecio_unitario(double p_u) {
        precio_unitario = p_u;
    }
    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public double precio_total_sin_igv() {
        return precio_unitario * cantidad;
    }
    public double igv() {
        return precio_total_sin_igv() * .18;
    }
    public double precio_total() {
        return precio_total_sin_igv() + igv();
    }
}
