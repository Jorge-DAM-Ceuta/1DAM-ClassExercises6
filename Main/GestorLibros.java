package EjerciciosT7;

import java.util.LinkedList;

public class GestorLibros {
    
    private LinkedList <Libro> biblioteca;
    
    public GestorLibros(){
        biblioteca = new LinkedList<>();
    }
    
    public void addLibro(Libro e){
        int count=0;
        
        if(biblioteca.isEmpty()){
            biblioteca.add(e);
        }else{
            for(Libro i : biblioteca){
                if(i.getCodigo()<e.getCodigo()){
                    count++;
                }
            }
            
            biblioteca.add(count, e);
        }
    }
    
    public void eliminarLibro(int codigo){
        for(Libro a : biblioteca){
            if(a.getCodigo()==codigo){
                biblioteca.remove(a);
            }
        }
    }
    
    public void modificarLibro(int codigo, String titulo){
        
        for(int i=0; i<biblioteca.size(); i++){
            if(biblioteca.get(i).getCodigo()==codigo){
                biblioteca.get(i).setTitulo(titulo);
            }
        }
    }
    
    public int numeroLibros(){
        return biblioteca.size();
    }
    
    public void resetBiblioteca(){
        biblioteca.clear();
    }
   
   
}
