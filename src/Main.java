public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.titulo = "Don Quijote de la Mancha";
        libro1.autor = "Miguel de Cervantes";
        libro1.numPag = 833;
        libro1.valoracion = 5;

        Libro libro2 = new Libro();
        libro2.titulo = "Cien años de soledad";
        libro2.autor = "Gabriel García Márquez";
        libro2.numPag = 423;
        libro2.valoracion = 4;

        libro1.mostrarinfo();
        System.out.println("");
        libro2.mostrarinfo();
    }
}