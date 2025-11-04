import java.util.HashSet;

public class Libreria {

    private HashSet<Libro> librosEnVenta = new HashSet<>();

    void agregarLibroAlStock(Libro unLibro) {
        librosEnVenta.add(unLibro);
    }

    public int cuantosLibrosTeQuedan() {
        return librosEnVenta.size();
    }

    public void venderTodo() {
        librosEnVenta.clear();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}