package EjerciciosT7;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetESports {
    
    private LinkedHashSet <String> nombreJugador;
    
    public LinkedHashSetESports(){
        nombreJugador = new LinkedHashSet <>();
    }
    
    public LinkedHashSetESports(LinkedHashSet e){
        nombreJugador = e;
    }
    
    public LinkedHashSetESports(LinkedHashSetESports other){
        nombreJugador = new LinkedHashSet <>();
        Iterator<String> itr = other.nombreJugador.iterator();
        String jugador;
        
        while(itr.hasNext()){
            jugador=itr.next();
            nombreJugador.add(jugador);
        }
    }
    
    public void muestraJugadores(){
        Iterator<String> itr =nombreJugador.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
    public boolean existeJugador(String jugador){
        return nombreJugador.contains(jugador);
    }
    
    public boolean compruebaEquipo(LinkedHashSet e){
        Iterator itr = e.iterator();
        
        while(itr.hasNext()){
            if(!nombreJugador.contains(itr.next())){
                return false;
            }
        }
        return true;
    }
    
    public LinkedHashSet<String> unionEquipo(LinkedHashSet<String> jugadores){
        LinkedHashSet<String> fullTeam= new LinkedHashSet<>();
        Iterator<String> itr= nombreJugador.iterator();
        Iterator<String> itr2= jugadores.iterator();
        
        while(itr.hasNext()){
            fullTeam.add(itr.next());
        }
        
        while(itr2.hasNext()){
            fullTeam.add(itr2.next());
        }
        
        return fullTeam;
    }
    
    public LinkedHashSet<String> interseccionEquipo(LinkedHashSet<String> jugadores){
        LinkedHashSet<String> fullTeam= new LinkedHashSet<>();
        Iterator<String> itr= nombreJugador.iterator();
        
        while(itr.hasNext()){
            if(jugadores.contains(itr.next())){
                fullTeam.add(itr.next());
            }
        }
        
        return fullTeam;
    }
    
    public LinkedHashSetESports ordenarEquipo(){
        LinkedHashSetESports resultado = new LinkedHashSetESports();
        Iterator <String> itr = nombreJugador.iterator();
        String elemento = "AAAAAAAAA";
        int size = nombreJugador.size();
        
        for(int i=0; i<size; i++){
            while(itr.hasNext()){
                String actual = itr.next();
                if(actual.compareTo(elemento)<0){
                    elemento = actual;
                }
            }
            
            resultado.nombreJugador.add(elemento);
            nombreJugador.remove(elemento);
            itr = nombreJugador.iterator();
        }
        
        return resultado;
    } 
    
}
