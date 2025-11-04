public class Documento {
    private int cantHojas;
    private int magentaNecesita;
    private int negroNecesita;
    private int amarilloNecesita;
    private int cianNecesita;
    public boolean Impreso;
    private boolean abrochado;

    public void abrochar(){
        abrochado = true;
    }

    public void asignarHojas(int cantHojas) {
        this.cantHojas = cantHojas;
    }
    public void asignarColores(int magenta, int negro, int amarillo,int cian){
        magentaNecesita = magenta;
        negroNecesita = negro;
        amarilloNecesita = amarillo;
        cianNecesita =cian;
    }

    public int getCantHojas() {
        return cantHojas;
    }


    public int getAmarilloNecesita() {
        return amarilloNecesita;
    }

    public int getMagentaNecesita() {
        return magentaNecesita;
    }

    public int getCianNecesita() {
        return cianNecesita;
    }

    public int getNegroNecesita() {
        return negroNecesita;
    }
}
