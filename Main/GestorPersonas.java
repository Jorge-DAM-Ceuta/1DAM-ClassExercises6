package EjerciciosT7;

import java.util.ArrayList;

public class GestorPersonas {
    
    private ArrayList<Persona> lista ;
    
    public GestorPersonas(){
    
    }
    
    public boolean buscarDNI(String DNI){
        for(Persona p : lista){
            if(p.getDNI().equals(DNI)){
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarPersona(String no, String ap){
        for(Persona p : lista){
            String n_act = p.getNombre();
            String ap_act = p.getApellidos();
            if(n_act.equals(no) && ap_act.equals(ap)){
                lista.remove(p);
                return true;
            }
        }
        
        return false;
    }
    
    public void ordenarLista(){
        Persona intercambio;
        
        for(int i=0; i<lista.size(); i++){
            for(int j=0; j<i; j++){
                if(lista.get(j).getEdad()>lista.get(j+1).getEdad()){
                    intercambio = lista.get(j);
                    lista.set(j, lista.get(j+i));
                    lista.set(j+1, intercambio);
                }
            }
        }
    }
    
    public void mostrarPersonas(){
        for(Persona p : lista){
            System.out.println(p.toString());
        }
    }
}
