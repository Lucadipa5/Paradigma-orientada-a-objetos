import java.util.ArrayList;

public class Producto {
    private int precio;
    private Categoria categoria;
    private String descripcion;
    private int cantMaxima;

    public Producto(int precio, Categoria categoria, String descripcion, int cantMaxima) {
        this.precio = precio;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.cantMaxima =  cantMaxima;
    }

    public boolean puedeSerEnviado(Carrito carrito) {
        return (getCantMaxima() > carrito.contarProductos(this));
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantMaxima() {
        return cantMaxima;
    }

    public boolean sePuedeEnviar(){
        return (getCategoria().isEsEnviable());
    }
}
