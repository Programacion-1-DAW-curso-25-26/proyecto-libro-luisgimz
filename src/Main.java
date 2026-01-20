import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Don Quijote de la Mancha","Miguel de Cervantes",833,4,1);
        Libro libro2 = new Libro("Don Quijote de la Mancho","Miguelon de Cervantes",823,4,1);

        ArrayList<Libro> biblioteca = new ArrayList<>();
        biblioteca.add(libro1);

        System.out.println(biblioteca.contains(libro2));
        //true por isbn hay otro


        HashSet<Libro> casera = new HashSet<>();
        System.out.println(casera.add(libro1)); //true
        System.out.println(casera.add(libro2)); //false son el mismo isbn en hascode


    }


}