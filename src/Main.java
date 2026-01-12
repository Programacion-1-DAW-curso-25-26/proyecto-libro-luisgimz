public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Don Quijote de la Mancha","Miguel de Cervantes",833,4);
        Libro libro2 = new Libro("Cien años de soledad","Gabriel García Márquez",423,4);

        libro1.mostrarinfo();
        System.out.println("");
        libro2.mostrarinfo();
    }
}