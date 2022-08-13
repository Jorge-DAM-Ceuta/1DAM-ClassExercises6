package EjerciciosT7;

public class CustomArray {
    
    private int tamano;
    private int [] array;
    
    public CustomArray(){
        tamano = 0;
        array = new int [tamano];
    }
    
    public CustomArray(int tam){
        tamano = tam;
        
        if(tamano>=0){
            array = new int [tamano];
        }
    }
    
    public CustomArray(CustomArray other){
        tamano = other.tamano;
        array = new int [other.array.length];
        
        for(int i=0; i<other.array.length; i++){
            array[i]=other.array[i];
        }
        
    }
    
    public int getArray(int i){
        if(i>=0 && i<array.length){
            return array[i];
        }else{
            return -1;
        }
    }
    
    public void setArray(int posicion, int valor){
        if(posicion>=0 && posicion<array.length){
            array[posicion] = valor;
        }
    }
    
    public void addElement(int posicion, int valor){
        int [] backup = new int [array.length];
        
        for(int i=0; i<array.length; i++){
            backup[i]=array[i];
        }
        
        array = new int [backup.length+1];
        
        for(int j=0; j<backup.length; j++){
            array[j] = backup[j];
        }
    }
    
    public void removeElement(int posicion, int valor){
        int [] backup = new int [array.length-1];
        
        for(int i=0; i<array.length; i++){
            backup[i]=array[i];
        }
        
        array = new int [backup.length+1];
        
        for(int j=0; j<backup.length; j++){
            array[j] = backup[j];
        }
    }
    
    
    
}
