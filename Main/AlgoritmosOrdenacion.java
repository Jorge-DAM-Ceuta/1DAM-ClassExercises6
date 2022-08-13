package EjerciciosT7;

public class AlgoritmosOrdenacion {
    
    private int [] v1, v2, v3;
    
    public AlgoritmosOrdenacion(){
        
        v1 = new int [1000];
        int j=0;
        for(int i=1000; i>0; i--){
            v1[j] = i; 
            j++;
        }
    //------------------------------//
        v2 = new int [1000];
        
        int k = 0;
        
        for(int i=1; i<500; i++){
            v2[k] = i; 
        }
        
        int x = 500;
        
        for(int i=1000; i<=500; i--){
            v2[x] = i;
            x++;
        }
    //------------------------------//    
        v3 = new int [1000];
        for(int i=0; i<v3.length; i++){
            v3[i] = (int)(Math.random()*10000); 
        }
    }
    
    public void burbuja(int [] array){
        int intercambio;
        
        for(int i=0; i<array.length ;i++){
            for(int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    intercambio=array[j];
                    array[j]=array[j+1];
                    array[j+1]=intercambio;
                }
            }
        }
    }
    
    public void insercion(int [] array){
        int actual;
        for(int i=1; i<array.length ;i++){
            actual=array[i];
            int j=i-1;
            while(j>=0 && actual<array[j]){
                array[j+1]=array[j];
                j--;
            }
             array[j+1]=actual;
        }
    }
    
    public void seleccion(int [] array){
        int valor_minimo, indice_minimo, intercambio;
        for(int i=0; i<array.length ;i++){
            valor_minimo=array[i];
            indice_minimo=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<valor_minimo){
                valor_minimo=array[j];
                indice_minimo=j;
            }
        }
            intercambio=array[i];
            array[i]=valor_minimo;
            array[indice_minimo]=intercambio;
        }
    }

    public int[] getV1() {
        return v1;
    }

    public int[] getV2() {
        return v2;
    }

    public int[] getV3() {
        return v3;
    }
    
    
}
