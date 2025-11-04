//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Tostadora tostadora = new Tostadora();
//        Pan p1 = new Pan();
//        Pan p2 = tostadora.dameUnPanTostado();
//        Pan p3 = tostadora.cambialoPorUnoTostado(p1);
//        p1 = p3;
//        boolean b1 = tostadora.decimeSiEstaTostado(new Pan())
//                && tostadora.cambialoPorUnoTostado(p1).estaTostado();
//        boolean b2 = p2.estaTostado() || tostadora.decimeSiEstaTostado(p3);
//        boolean b3 = p3 == tostadora.dameUnPanTostado();
//        boolean b4 = p1.estaTostado() == tostadora.decimeSiEstaTostado(p1);
//        boolean b5 = tostadora.dameUnPanTostado() == p2;
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);
//        System.out.println(b4);
//        System.out.println(b5);
        Turnero turnero = new Turnero();
        Turno t1 = turnero.dameUnTurno();
        turnero.dameUnTurno();
        Turno t2 = turnero.dameUnTurno();
        boolean c1 = t1.queNumeroTiene() == t2.queNumeroTiene();
        boolean c2 = t1 == t2;
        boolean c3 = turnero.queNumeroVa() == turnero.dameUnTurno().queNumeroTiene();
        int i1 = turnero.queNumeroVa();
        boolean c4 = turnero.quienEstaPrimero(t1, t2) == t2;
        boolean c5 = turnero.quienEstaPrimero(t2, new Turno(1)) == new Turno(1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);


    }}