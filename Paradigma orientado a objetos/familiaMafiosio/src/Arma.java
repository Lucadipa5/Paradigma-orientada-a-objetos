public abstract class Arma {
    private int potenciaDestructiva;
    private int puntosDeHonorEnArma;

    public Arma(int potenciaDestructiva, int puntosDeHonorEnArma) {
        this.potenciaDestructiva = potenciaDestructiva;
        this.puntosDeHonorEnArma = puntosDeHonorEnArma;
    }

    public boolean isHeavy(){
        return((this.getPotenciaDestructiva() > 200 || this.getPuntosDeHonorEnArma() > 10));
    }

    public int getPotenciaDestructiva() {
        return potenciaDestructiva;
    }

    public int getPuntosDeHonorEnArma() {
        return puntosDeHonorEnArma;
    }
}
