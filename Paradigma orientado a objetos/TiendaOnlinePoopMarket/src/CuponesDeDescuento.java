public abstract class CuponesDeDescuento {
    protected int descuentoAplicado;

    protected CuponesDeDescuento(int descuentoAplicado) {
        this.descuentoAplicado = descuentoAplicado;
    }

    public abstract void aplicarDescuento(Carrito carrito);
    public abstract boolean sePuedeAplicar(Carrito carrito);

    public int getDescuentoAplicado() {
        return descuentoAplicado;
    }

    public void setDescuentoAplicado(int descuentoAplicado) {
        this.descuentoAplicado = descuentoAplicado;
    }
}
