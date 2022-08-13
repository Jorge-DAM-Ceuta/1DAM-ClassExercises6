package EjerciciosT7;

import java.time.LocalDate;

public class Libro {
    
    private String titulo, autor;
    private LocalDate fechaPublicacion;
    private int codigo;
    
    public Libro(){
        titulo="";
        autor="";
        fechaPublicacion=null;
        codigo=0;
    }

    public Libro(String titulo, String autor, LocalDate fechaPublicacion, int codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.codigo = codigo;
    }
    
    public Libro(Libro other) {
        this.titulo = other.titulo;
        this.autor = other.autor;
        this.fechaPublicacion = other.fechaPublicacion;
        this.codigo = other.codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion.toString() + ", codigo=" + codigo + '}';
    }
    
    
    
}
