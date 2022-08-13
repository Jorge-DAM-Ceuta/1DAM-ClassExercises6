/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosT7;

import java.util.HashMap;

/**
 *
 * @author jorge
 */
public class Agenda {
    
    private HashMap <Integer, String> agenda;
    
    public Agenda(){
        agenda = new HashMap <> ();
    }
    
    public boolean agendaVacia(){
        return agenda.isEmpty();
    }
    
    public int numeroContactos(){
        return agenda.size();
    }
    
    public void addContacto(int num, String nombre){
        agenda.put(num, nombre);
    }
    
    public boolean comprobarNumero(int numero){
        return agenda.containsKey(numero);
    }
    
    public boolean comprobarNumero(String nombre){
        return agenda.containsValue(nombre);
    }
    
    public boolean borrarContacto(int numero){
        if(agenda.remove(numero)==null){
            return false;
        }else{
            return true;
        }
    }
    
    public void modificarContacto(int numero, String nombre){
        agenda.replace(numero, nombre);
    }
    
    public void modificarContacto2(int numero, String nombre, String sustitucion){
        agenda.replace(numero, nombre, sustitucion);
    }
    
    public void vaciarAgenda(){
        agenda.clear();
    }
    
    
}
