//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Carrito carrito = new Carrito("Juan");
        System.out.println(carrito.getClienteAsociado());
        carrito.vaciarCarrito();
    Categoria celulares = new Categoria(true);
    Categoria televisores = new Categoria(true);
    Producto Iphone12 = new Producto(123,celulares,"Iphone 12",2);
    Producto Televisor = new Producto(100,televisores,"Tele",23);
    DescuentoFijo cien = new DescuentoFijo(23,Iphone12);
    DescuentoPorCategoria teles = new DescuentoPorCategoria(25,televisores);
    ProductoDependiente cargadorIphone12 = new ProductoDependiente(25,celulares,"Cargador",6,Iphone12);
    carrito.añadirProducto(Iphone12);
    carrito.añadirProducto(cargadorIphone12);
    carrito.añadirProducto(Televisor);
    carrito.añadirDescuentos(cien);
    carrito.añadirDescuentos(teles);
    System.out.println(carrito.getProductos());
    System.out.println(Televisor.getPrecio());
    System.out.println(Iphone12.getPrecio());
    System.out.println(carrito.valorCarrito()+ "Precio iphone " + Televisor.getPrecio());
    }
}