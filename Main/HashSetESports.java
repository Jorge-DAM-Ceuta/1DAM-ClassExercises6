package EjerciciosT7;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetESports {
    
    private HashSet <String> equipo;
    
    public HashSetESports(){
        equipo = new HashSet<>();
    }
    
    public HashSetESports(String [] array){
        equipo = new HashSet<>();
        
        for(int i=0; i<array.length; i++){
            equipo.add(array[i]);
        }
    }
    
    public HashSetESports(HashSetESports copia){
        Iterator<String> itr = copia.equipo.iterator();
        String jugador;
        
        while(itr.hasNext()){
            jugador=itr.next();
            equipo.add(jugador);
        }
    }
    
    public void muestraJugadores(){
        Iterator<String> itr = equipo.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
    public boolean existeJugador(String jugador){
        return equipo.contains(jugador);
    }
    
    public boolean compruebaEquipo(HashSet e){
        Iterator itr = e.iterator();
        
        while(itr.hasNext()){
            if(!equipo.contains(itr.next())){
                return false;
            }
        }
        return true;
    }
    
    public HashSet<String> unionEquipo(HashSet<String> jugadores){
        HashSet<String> fullTeam= new HashSet<>();
        Iterator<String> itr= equipo.iterator();
        Iterator<String> itr2= jugadores.iterator();
        
        while(itr.hasNext()){
            fullTeam.add(itr.next());
        }
        
        while(itr2.hasNext()){
            fullTeam.add(itr2.next());
        }
        
        return fullTeam;
    }
    
    public HashSet<String> interseccionEquipo(HashSet<String> jugadores){
        HashSet<String> fullTeam= new HashSet<>();
        Iterator<String> itr= equipo.iterator();
        
        while(itr.hasNext()){
            if(jugadores.contains(itr.next())){
                fullTeam.add(itr.next());
            }
        }
        
        return fullTeam;
    }
    
    public HashSetESports ordenarEquipo(){
        HashSetESports resultado = new HashSetESports();
        Iterator <String> itr = equipo.iterator();
        String elemento = "AAAAAAAAA";
        int size = equipo.size();
        
        for(int i=0; i<size; i++){
            while(itr.hasNext()){
                String actual = itr.next();
                if(actual.compareTo(elemento)<0){
                    elemento = actual;
                }
            }
            
            resultado.equipo.add(elemento);
            equipo.remove(elemento);
            itr = equipo.iterator();
        }
        
        return resultado;
    } 
    
}
