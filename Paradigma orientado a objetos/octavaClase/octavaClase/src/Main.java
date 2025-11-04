//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Medallon Carne = new Medallon(30);
    Medallon Pollo = new Medallon(2 );
    Medallon Vegetariano = new Medallon(3);


    Adicional HuevosFritos = new Adicional(9);
    Adicional Cheddar = new Adicional(2);
    Adicional Berenjena = new Adicional(3);
    Adicional Tomate = new Adicional(4);
    Adicional Lechuga = new Adicional(5);

    Pan Papa = new Pan(30);
    Pan Normal = new Pan(2);

    Hamburguesa hamburguesa = new Hamburguesa();
    hamburguesa.agregarAdcional(HuevosFritos);

    hamburguesa.agregarMedallon(Carne);

    hamburguesa.agregarPan(Papa);
    System.out.println(hamburguesa.Facturable());

        System.out.println(hamburguesa.precioBase());
        System.out.println(hamburguesa.precio());

    }
}