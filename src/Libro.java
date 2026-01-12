public class Libro {

   public Libro(String titulo,String autor,int numPag,int valoracion){
       this.titulo = titulo;
       this.autor = autor;
       this.numPag = numPag;
       this.valoracion = valoracion;
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
    public void mostrarinfo(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(numPag);
        System.out.println(valoracion);
    }
}
