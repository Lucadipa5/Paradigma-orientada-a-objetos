public class Evento {
    // el organizador reparte pulseras de colores
    // pulsera para alumnos y gente que viene a ver el evento, 4 colores
    // dependiendo del color se va a pagar mas o menos.
    // negra == 10000 pesos, azul == 7000, verde == gratis, naranja,rojo y rosa == 5000
    //

    public int cuantoPaga(Persona persona){
            return persona.pulsera.precio;
    }
}

