public class Humano extends Habitante{

    public Humano(int edad) {
        super(edad);
    }
    public int getEdad(){
        return this.edad;
    }
    @Override
    public boolean mereceRegalo() {
        return (12 > getEdad());
    }
}
