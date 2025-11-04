public class Ciudad {
private int importeTurista;
private boolean isTuristica;
    public int getImporteTurista() {
        if (isTuristica){
        return importeTurista;
        }
        else{
            return 0;
    }
    }


    public boolean isTuristica() {
        return isTuristica;
    }

    public void setTuristica(boolean turistica) {

        isTuristica = turistica;
    }

    public void setImporteTurista(int importeTurista) {
        this.importeTurista = importeTurista;
    }
}
