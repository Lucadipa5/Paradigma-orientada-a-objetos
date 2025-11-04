import java.util.HashSet;

public class Ciudad {
private int tasaTurista;
private int diasDeEstancia;

    public Ciudad(int tasaTurista,int diasDeEstancia) {
        this.tasaTurista = tasaTurista;
        this.diasDeEstancia = diasDeEstancia;
    }

    public int getTasaTurista() {
        return tasaTurista*getDiasDeEstancia();
    }

    public void setTasaTurista(int tasaTurista) {
        this.tasaTurista = tasaTurista;
    }

    public int getDiasDeEstancia() {
        return diasDeEstancia;
    }
}
