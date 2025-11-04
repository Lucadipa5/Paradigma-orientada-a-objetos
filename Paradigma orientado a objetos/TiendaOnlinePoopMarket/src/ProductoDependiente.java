public class ProductoDependiente extends Producto{
    private Producto productoNecesario;

    public ProductoDependiente(int precio, Categoria categoria, String descripcion, int cantMaxima, Producto productoNecesario) {
        super(precio, categoria, descripcion, cantMaxima);
        this.productoNecesario = productoNecesario;
    }

    public Producto getProductoNecesario() {
        return productoNecesario;
    }

    @Override
    public boolean puedeSerEnviado(Carrito carrito) {
       return carrito.getProductos().contains(productoNecesario);
    }
}
