
public class Persona extends Habitante {
    public Persona(int edad, Domicilio domicilio) {
        super(edad, domicilio);
    }
    @Override
    public boolean mereceRegalo() {
        return this.edad < 12;
    }



}
