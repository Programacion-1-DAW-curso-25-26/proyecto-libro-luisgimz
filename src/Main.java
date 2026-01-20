public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Don Quijote de la Mancha","Miguel de Cervantes",833,4,10);
        Libro libro2 = new Libro("Don Quijote de la Mancho","Miguelon de Cervantes",823,4,1);

        if (libro2.equals(libro1)){
            System.out.println("Son iguales");
        } else {
            System.out.println("son diferentes");}
        System.out.println(libro1);
    }
}