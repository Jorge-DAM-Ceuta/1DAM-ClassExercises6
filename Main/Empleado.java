package EjerciciosT7;

public class Empleado {
    
    private String nombre;
    private double sueldo;
    
    public Empleado(String n, double s){
        nombre=n;
        sueldo=s;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public String toString(){
        return "El empleado " + nombre + " cobra " + sueldo + "$";
    }
    
}
