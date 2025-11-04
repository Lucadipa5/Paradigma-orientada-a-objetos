import java.util.ArrayList;
import java.util.HashSet;

public class Carrito {
    private ArrayList<Producto> productos = new ArrayList<>();
    private HashSet<CuponesDeDescuento> cuponesDeDescuentos = new HashSet<>();
    private String clienteAsociado;

    public Carrito(String clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public void añadirProducto(Producto producto) {
        if(producto.puedeSerEnviado(this))
        productos.add(producto);
    }

    public void vaciarCarrito(){
        productos.clear();
    }

    public String getClienteAsociado() {
        return clienteAsociado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public boolean sePuedeEnviar(){
        boolean puede = true;
        for (Producto producto : productos) {
            if(!producto.sePuedeEnviar()){
                puede = false;
            }
        }
        return puede;
    }

    public int contarProductos(Producto producto){
        int contador = 0;
        for (Producto producto1 : productos) {
            if(producto1.equals(producto)){
                contador++;
            }
        }
        return contador;
    }

    public Producto productoMasCaro(){
        Producto caro = null;
        int precioCaro = 0;
        for (Producto producto : productos) {
            if(producto.getPrecio() > precioCaro){
                precioCaro = producto.getPrecio();
                caro = producto;
            }
        }
        return caro;
    }

    public void añadirDescuentos(CuponesDeDescuento descuento){
        cuponesDeDescuentos.add(descuento);
    }

    public int valorCarrito(){
        descuentosAplicados();
        return (preciosProductos());
    }

    private int preciosProductos(){
        int valorProductos = 0;
        for (Producto producto : productos) {
           valorProductos += producto.getPrecio();
        }
        return valorProductos;
    }

    private void descuentosAplicados(){
        for (CuponesDeDescuento descuento : cuponesDeDescuentos) {
        descuento.aplicarDescuento(this);
        }
    }

}
