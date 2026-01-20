import java.util.Objects;

public class Libro {

   public Libro(String titulo,String autor,int numPag,int valoracion,int isbn){
       this.titulo = titulo;
       this.autor = autor;
       this.numPag = numPag;
       this.valoracion = valoracion;
       this.isbn = isbn;
   }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String titulo;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    private String autor;

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    private int numPag;

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    private int valoracion;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    private int isbn;

    public void mostrarinfo(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(numPag);
        System.out.println(valoracion);
        System.out.println(isbn);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPag=" + numPag +
                ", valoracion=" + valoracion +
                ", isbn=" + isbn +
                '}';
    }

}
