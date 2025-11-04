public class ImpresoraAbrochadora extends Impresora {
    public ImpresoraAbrochadora(int cian, int magenta, int amarillo, int negro, int hojas ){
        super(cian, magenta,amarillo,negro,hojas);
    }
    @Override
    public Documento Imprimir(Documento documento){
        Documento unDocumentoImpresoPeroNoAbrochado = super.Imprimir(documento);
        unDocumentoImpresoPeroNoAbrochado.abrochar();
        return unDocumentoImpresoPeroNoAbrochado;

    }

}