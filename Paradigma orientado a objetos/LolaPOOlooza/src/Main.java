public class Main {
    public static void main(String[] args) {
        Escenario e1 = new Escenario(true);
        Artista Airbag = new Artista("Viernes",e1);
        TicketB3 b3 = new TicketB3(); //Anda
        TicketB7 b7 = new TicketB7(); //anda
        TicketPlus plus = new TicketPlus(); //Anda
        TicketCustom custom = new TicketCustom();
        TicketGeneral general = new TicketGeneral("Viernes");
        TicketDePrensa prensaaa = new TicketDePrensa();
        TicketFan EzequielVales = new TicketFan(Airbag);
        custom.añadirArtista(Airbag);
        b3.verArtista(Airbag);
        b3.verArtista(Airbag);
        b3.verArtista(Airbag);
        System.out.println("B3 "+b3.entradaValida(Airbag));
        b7.verArtista(Airbag);
        b7.verArtista(Airbag);
        b7.verArtista(Airbag);
        b7.verArtista(Airbag);
        b7.verArtista(Airbag);
        b7.verArtista(Airbag);
        b7.verArtista(Airbag);
        System.out.println("B7 "+b7.entradaValida(Airbag));
        general.verArtista(Airbag);
        System.out.println("General "+general.entradaValida(Airbag));
        plus.verArtista(Airbag);
        System.out.println("Plus "+plus.entradaValida(Airbag));
        custom.verArtista(Airbag);
        System.out.println("Custom " + custom.entradaValida(Airbag));
        EzequielVales.verArtista(Airbag);
        System.out.println("Fan " + EzequielVales.entradaValida(Airbag));
        prensaaa.verArtista(Airbag);
        System.out.println("Prensa: " + prensaaa.entradaValida(Airbag));
        System.out.println("Cantidad esperada: 15");
        System.out.println("Cantidad: " + Airbag.getCantAsistentes());

        }
    }
