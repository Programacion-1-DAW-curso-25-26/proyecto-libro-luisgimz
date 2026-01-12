public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setTitulo("Don Quijote de la Mancha");
        libro1.setAutor("Miguel de Cervantes");
        libro1.setNumPag(833);
        libro1.setValoracion(4);

        Libro libro2 = new Libro();
        libro2.setTitulo("Cien años de soledad");
        libro2.setAutor("Gabriel García Márquez");
        libro2.setNumPag(423);
        libro2.setValoracion(4);

        libro1.mostrarinfo();
        System.out.println("");
        libro2.mostrarinfo();
    }
}