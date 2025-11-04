public class DescuentoFijo extends CuponesDeDescuento {
    private Producto productoAsociado;

    protected DescuentoFijo(int descuentoAplicado, Producto productoAsociado) {
        super(descuentoAplicado);
        this.productoAsociado = productoAsociado;
    }

    @Override
    public void aplicarDescuento(Carrito carrito) {
        for (Producto producto : carrito.getProductos()) {
            if(producto.equals(getProductoAsociado())){
                producto.setPrecio(producto.getPrecio()-this.getDescuentoAplicado());
            }
        }
       }

    @Override
    public boolean sePuedeAplicar(Carrito carrito) {
        return (carrito.getProductos().contains(productoAsociado));
    }

    public Producto getProductoAsociado() {
        return productoAsociado;
    }
}

