public abstract class Beneficio {
    private int valor;

    public Beneficio(int valor) {
        this.valor = valor;
    }
    public abstract boolean esValido(Empleado empleado);

    public int getValor(){
        return valor;
    }

    @Override
    public String toString() {
        return "Beneficio{" +
                "valor=" + valor +
                '}';
    }
}
