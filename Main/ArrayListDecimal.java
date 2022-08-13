package EjerciciosT7;

import java.util.ArrayList;

public class ArrayListDecimal {
    
    private ArrayList <Double> lista;
    
    public ArrayListDecimal(){
        lista = new ArrayList <Double>();
    }
    
    public boolean agregarFinal(double num){
        return lista.add(num);
    }
    
    public void agregarNumero(int posicion, double num){
        lista.add(posicion, num);
    }
    
    public boolean buscarNumero(double num){
        return lista.contains(num);
    }
    
    public double buscarPosicion(int posicion){
        return lista.get(posicion);
    }
    
    public void modificarNumero(int posicion, double num){
        lista.set(posicion, num);
    }
    
    public boolean eliminarNumero(double num){
        return lista.remove(num);
    }
    
    public boolean eliminarPosicion(int posicion){
        if(lista.remove(posicion)!=null){
            return true;
        }else{
            return false;
        }
    }
    
    public int tamanoLista(){
        return lista.size();
    }
    
    public void vaciarLista(){
        lista.clear();
    }
    
    public void duplicarArrayList(ArrayList <Double> other){
        lista.addAll(other);
    }
    
    public ArrayList<Double> sublista(int inicio, int fin){
        ArrayList <Double> resultado = new ArrayList <Double>();

        resultado.addAll(lista.subList(inicio, fin));
        
        return resultado;
    }
    
}
