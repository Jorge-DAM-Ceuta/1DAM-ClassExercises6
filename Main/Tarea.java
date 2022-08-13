package EjerciciosT7;

import java.time.LocalDateTime;

public class Tarea {
    
    private String titulo;
    private LocalDateTime fechaHora;
    private int nUrgencia;

    public Tarea(){
        this.titulo = "";
        this.fechaHora = null;
        this.nUrgencia = 0;
    }
    
    public Tarea(String titulo, LocalDateTime fechaHora, int nUrgencia) {
        this.titulo = titulo;
        this.fechaHora = fechaHora;
        this.nUrgencia = nUrgencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getnUrgencia() {
        return nUrgencia;
    }

    public void setnUrgencia(int nUrgencia) {
        this.nUrgencia = nUrgencia;
    }

    @Override
    public String toString() {
        return "Tarea{" + "titulo=" + titulo + ", fechaHora=" + fechaHora + ", nUrgencia=" + nUrgencia + '}';
    }
    
    
}
