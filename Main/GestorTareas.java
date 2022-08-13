/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosT7;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author jorge
 */
public class GestorTareas {
    
    private Stack <Tarea> lista; 
    
    public GestorTareas(){
        lista = new Stack<>();
    }
    
    public Tarea consultarLista(){
        return lista.peek();
    }
    
    public void agregarTarea(Tarea t){
        lista.push(t);
    }
    
    public Tarea eliminarUltimaTarea(){
        return lista.pop();
    }
    
    public boolean buscarTarea(Tarea t){
        if(lista.search(t)!=-1){
            return true;
        }
        
        return false;
    }
    
    public void ordenarTareas(){
        ArrayList <Tarea> u1, u2, u3;
        u1 = new ArrayList <>();
        u2 = new ArrayList <>();
        u3 = new ArrayList <>();
    
        while(!lista.isEmpty()){
            if(lista.peek().getnUrgencia()==1){
                u1.add(lista.pop());
            }
            if(lista.peek().getnUrgencia()==2){
                u2.add(lista.pop());
            }
            if(lista.peek().getnUrgencia()==3){
                u3.add(lista.pop());
            }
        }
        
        for(Tarea t : u3){
            lista.push(t);
        }
        
        for(Tarea t : u2){
            lista.push(t);
        }
        
        for(Tarea t : u1){
            lista.push(t);
        }
    }
    
}
