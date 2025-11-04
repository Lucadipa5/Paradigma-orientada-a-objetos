import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Libro quijote = new Libro("El Quiojote","Cervantes");
        Libro martinFierro = new Libro("Martin Fierro","Jose Hernandez");
        Libro elPrincipito = new Libro("El Principito","Saints Ermes");

        //set
        HashSet<Libro> libros = new HashSet<Libro>();
        System.out.println("---SET---");
        System.out.println(libros.size());
        libros.add(quijote);
        System.out.println(libros.size());
        libros.add(elPrincipito);
        System.out.println(libros.size());
        libros.add(elPrincipito);
        System.out.println(libros.size());
        libros.add(new Libro("Mi lucha","Bautista Perez Plate"));
        libros.add(martinFierro);

        //list
        ArrayList<Libro> librosLeidos = new ArrayList<Libro>();
        System.out.println("\n---LIST---");
        System.out.println(librosLeidos.size());
        librosLeidos.add(quijote);
        System.out.println(librosLeidos.size());
        librosLeidos.add(elPrincipito);
        System.out.println(librosLeidos.size());
        librosLeidos.add(quijote);
        System.out.println(librosLeidos.size());

        elPrincipito.leer();
        System.out.println(librosLeidos);

        System.out.println(librosLeidos.get(1));
        System.out.println(librosLeidos.size());
        System.out.println(librosLeidos.getFirst());
        System.out.println(librosLeidos.getLast());

        //recorrer: libros.for

        for (Libro libro : libros) {
            System.out.println("Este es un libro a leer " + libro);
            libro.leer();
        }

        for (Libro libro : librosLeidos) {
            System.out.println("Este es un libro de List " + libro);
            libro.leer();
        }

        Libreria santaFe = new Libreria();
        santaFe.agregarLibroAlStock(elPrincipito);
        System.out.println(santaFe.cuantosLibrosTeQuedan());
    }
}