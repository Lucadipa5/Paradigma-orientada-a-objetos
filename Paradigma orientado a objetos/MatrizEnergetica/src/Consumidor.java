public class Consumidor {
    private int cantidadQueConsume;

    public Consumidor(int cantidadQueConsume) {
        this.cantidadQueConsume = cantidadQueConsume;
    }

    public int getCantidadQueConsume() {
        return cantidadQueConsume;
    }

    public void actualizarCantidadQueConsume(int cantidadQueConsume) {
        this.cantidadQueConsume = cantidadQueConsume;
    }
}
