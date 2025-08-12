public class Pistola {
    private boolean recargada = true;
    private int cantDeBalas = 0;
    private boolean suciedad = true;

    public boolean estaRecargada() {
        return recargada;
    }
    public int cuantasBalasTengo() {
        return cantDeBalas;
    }
    public boolean estaLimpia(){
        return suciedad;
    }
    public void limpiar(){
        suciedad = false;
    }
    public void recargar() {
        cantDeBalas = 8;
        recargada = true;
    }

    }


