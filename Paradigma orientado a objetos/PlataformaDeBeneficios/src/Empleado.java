import java.util.ArrayList;

public class Empleado {
    private int antiguedad;
    private int diasPresenciales;
    private int puntos;
    ArrayList<Beneficio> beneficios = new ArrayList<>();

    public Empleado(int antiguedad, int diasPresenciales, int puntos) {
        this.antiguedad = antiguedad;
        this.diasPresenciales = diasPresenciales;
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public void canjearBeneficio(Beneficio beneficio) {
        if (puntos >= beneficio.getValor() && validarBeneficio(beneficio)) {
            puntos -= beneficio.getValor();
            agregarBeneficio(beneficio);
        }
    }

    private void agregarBeneficio(Beneficio beneficio){
        beneficios.add(beneficio);
    }

    public boolean validarBeneficio(Beneficio beneficio){
        return beneficio.esValido(this);
    }

    public int getDiasPresenciales() {
        return diasPresenciales;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    public void mostrarLista(){
        for (Beneficio beneficio : beneficios) {
            System.out.println(beneficio);
        }
    }
    public ArrayList<Beneficio> beneficiosYaCanjeados(){
        return beneficios;
    }
    public Beneficio beneficioMayor() {
    Beneficio mayor =  beneficios.get(0);
        for (Beneficio beneficio : beneficios) {
            if(beneficio.getValor() > mayor.getValor()){
                mayor  = beneficio;
            }
        }
        return mayor;
    }
}


