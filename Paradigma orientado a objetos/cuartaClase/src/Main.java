//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Documento miCV = new Documento();
        Impresora Ezequielsora = new Impresora(1, 5, 3, 2, 6);
    miCV.asignarColores(1,5,3,2);
    miCV.asignarHojas(6);
    System.out.println(miCV.getCantHojas());
    System.out.println(Ezequielsora.podesImprimir(miCV));
    Ezequielsora.Imprimir(miCV);
    System.out.println(Ezequielsora.toString());
    ImpresoraByN impresoraByN = new ImpresoraByN(100,100);
    impresoraByN.imprimir(miCV);
    System.out.println(impresoraByN);



    }
}