package EjerciciosT7;

public class Persona {
    
    private String DNI, nombre, apellidos, genero;
    private int edad;
    private double peso;
    
    public Persona(){
        DNI = nombre = apellidos = genero = "";
        edad = 0;
        peso = 0;
    }
    
    public Persona(String DN, String no, String ap, String ge, int ed, double pe){
        DNI = DN;
        nombre = no;
        apellidos = ap;
        genero = ge;
        edad = ed;
        peso = pe;
    }
    
    public Persona(Persona other){
        DNI = other.DNI;
        nombre = other.nombre;
        apellidos = other.apellidos;
        genero = other.genero;
        edad = other.edad;
        peso = other.peso;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", genero=" + genero + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    
}
