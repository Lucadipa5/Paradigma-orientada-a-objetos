public class Libro {
    private final String titulo;
    private final String autor; // No se cambia por ser final.
    private int cantidadLecturas ;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    void leer(){
        cantidadLecturas ++;
    }
}