import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        ArrayList<Libro> biblioteca = new ArrayList<>();
        do{
            imprimirMenu();
            opcion = sc.nextLine().toLowerCase().charAt(0);
            switch (opcion){
                case 'a':
                    anyadirLibro(biblioteca, sc);
                    break;
                case 'b':
                    mostarLibros(biblioteca);
                    break;
                case 'c':
                    buscarLibro(biblioteca,sc);
                    break;
                case 'd':
                    eliminarLibro(biblioteca,sc);
                    break;
                case 'e':
                    vaciarLista(biblioteca);
                    break;
                case 'f':
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
        } while (opcion!= 'f');
    }

    private static void vaciarLista(ArrayList<Libro> biblioteca) {
        int tamanyo = biblioteca.size();
        biblioteca.clear();
        System.out.println("Borrados : "+ tamanyo +" libros");
    }

    private static void eliminarLibro(ArrayList<Libro> biblioteca, Scanner sc) {
        System.out.println("Introduce ISBN");
        int isbnB = sc.nextInt();
        sc.nextLine();
        Iterator<Libro> it = biblioteca.iterator();
        while (it.hasNext()){
            Libro l =it.next();
            if (l.getIsbn()==isbnB){
                it.remove();
            }
        }
    }

    private static void buscarLibro(ArrayList<Libro> biblioteca,Scanner sc) {
        System.out.println("Introduce ISBN");
        int isbnB = sc.nextInt();
        sc.nextLine();
        for (Libro l : biblioteca){
            if (l.getIsbn()==isbnB){
                System.out.println(l);
            } else {
                System.out.println("No encontrado");
            }
        }
    }

    private static void mostarLibros(ArrayList<Libro> biblioteca) {
        for (int i =0; i < biblioteca.size(); i++){
            System.out.println(biblioteca.get(i));
        }
    }

    public static void imprimirMenu() {
        System.out.println("--- MENÚ LIBRERÍA ---\n" +
                "a. Añadir Libro\n" +
                "b. Mostrar Libros\n" +
                "c. Buscar por ISBN\n" +
                "d. Eliminar por ISBN\n" +
                "e. Vaciar lista\n" +
                "f. Salir\n" +
                "Seleccione opción:");
    }

    private static void anyadirLibro(ArrayList<Libro> biblioteca, Scanner sc) {
        String nombre;
        String autor;
        int numPaginas;
        int isbn;
        System.out.println("Dime el nombre");
        nombre = sc.nextLine();
        System.out.println("Dime el autor");
        autor = sc.nextLine();
        System.out.println("Dime el número de páginas");
        numPaginas = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime el ISBN");
        isbn = sc.nextInt();
        sc.nextLine();
        Libro nuevo = new Libro(nombre, autor, numPaginas,isbn);
        biblioteca.add(nuevo);
    }
}