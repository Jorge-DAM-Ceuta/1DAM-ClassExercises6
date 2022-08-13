package EjerciciosT7;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEmpleado {
    
    private HashSet<Empleado> Lista = new HashSet<>();
    
    public HashSetEmpleado(){
        Lista = new HashSet<>();
    }
    
    public void funciones(int i, Empleado e){
        
        switch(i){
            case 1:
                Lista.add(e);
            break;
            
            case 2:
                Iterator<Empleado> itr = Lista.iterator();
                while(itr.hasNext()){
                    System.out.println(itr.next().toString());
                }
            break;
            
            case 3:
                boolean comp=Lista.remove(e);
                System.out.println(comp);
            break;
            
            case 4:
                Lista.clear();
            break;
            
            case 5:
                System.out.println("Numero de empleados: " + Lista.size() + ".");
            break;
            
            case 6:
                if(Lista.contains(e)){
                    System.out.println(e.toString());
                }else{
                    System.out.println("No existe el empleado");
                }
            break;
        }
    }
}
