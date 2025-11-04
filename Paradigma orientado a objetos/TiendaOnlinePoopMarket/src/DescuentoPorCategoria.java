public class DescuentoPorCategoria extends CuponesDeDescuento {
    private Categoria categoriaAsociada;

    protected DescuentoPorCategoria(int descuentoAplicado, Categoria categoriaAsociada) {
        super(descuentoAplicado);
        this.categoriaAsociada = categoriaAsociada;
    }

    @Override
    public void aplicarDescuento(Carrito carrito) {
        for (Producto producto : carrito.getProductos()) {
            if (producto.getCategoria().equals(categoriaAsociada)) {
                producto.setPrecio((producto.getPrecio())-(producto.getPrecio()*this.getDescuentoAplicado()/100));
            }
        }
    }

    @Override
    public boolean sePuedeAplicar(Carrito carrito) {
        return false;
    }
}