public class Impresora {

    private int cianRecipiente;
    private int negroRecipiente;
    private int amarilloRecipiente;
    private int magentaRecipient;
    private int cantidadPaginasImpresas = 0;
    private int cantidadDocumentos = 0;
    private int cantHojas = 0;

    public Impresora(int cian, int magenta, int amarillo, int negro, int hojas) {
    }

    //    public Impresora(int magenta,int negro,int amarillo, int cian, int hojas){
//        magentaRecipient=magenta;
//        negroRecipiente=negro;
//        amarilloRecipiente=amarillo;
//        cianRecipiente=cian;
//        cantHojas = hojas;
//    }
    public Boolean podesImprimir(Documento documento){
        return(cianRecipiente >= documento.getCianNecesita() &&
                negroRecipiente >= documento.getNegroNecesita() &&
            magentaRecipient >= documento.getMagentaNecesita() &&
                amarilloRecipiente >= documento.getAmarilloNecesita() &&
                documento.getCantHojas() >= 0);


    }
    public Documento Imprimir(Documento documento){
            documento.Impreso = true;
            negroRecipiente =- documento.getNegroNecesita();
            magentaRecipient =- documento.getMagentaNecesita();
            amarilloRecipiente =- documento.getAmarilloNecesita();
            cianRecipiente =- documento.getCianNecesita();
            cantHojas =- documento.getCantHojas();
            cantidadPaginasImpresas =+ documento.getCantHojas() ;
            return documento;
}
    public void setCantHojas(int hojas){
        cantHojas = hojas;
    }
    public int getCianRecipiente() {
        return cianRecipiente;
    }

    public int getMagentaRecipient() {
        return magentaRecipient;
    }

    public int getAmarilloRecipiente() {
        return amarilloRecipiente;
    }

    public int getNegroRecipiente() {
        return negroRecipiente;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "cianRecipiente=" + cianRecipiente +
                ", negroRecipiente=" + negroRecipiente +
                ", amarilloRecipiente=" + amarilloRecipiente +
                ", magentaRecipient=" + magentaRecipient +
                ", cantidadPaginasImpresas=" + cantidadPaginasImpresas +
                ", cantidadDocumentos=" + cantidadDocumentos +
                ", cantHojas=" + cantHojas +
                '}';
    }
}
