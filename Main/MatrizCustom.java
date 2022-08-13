package EjerciciosT7;

public class MatrizCustom {
    
    private int [] [] matriz;
    
    public MatrizCustom(){
        matriz = null;
    }
    
    public MatrizCustom(int fila, int columna){
        if(fila>0 && columna>0){
            matriz = new int [fila] [columna];
        }
    }
    
    public MatrizCustom(MatrizCustom other){
        int otherFila, otherColumna;
        otherFila=other.matriz.length;
        otherColumna=other.matriz[0].length;
        matriz = new int [otherFila] [otherColumna];
        
        for(int i=0; i<otherFila; i++){
            for(int j=0; j<otherColumna; j++){
                matriz[i][j]=other.matriz[i][j];
            }
        }
    }
        
    public int getPosicion(int fila, int columna){
        if(fila>0 && columna>0 && fila<matriz.length && columna<matriz.length){
            return matriz[fila][columna];
        }else{
            return -1;
        }
    }
    
    public void setMatriz(int valor, int fila, int columna){
        if(fila>0 && columna>0 && fila<matriz.length && columna<matriz.length){
            matriz[fila][columna]=valor;
        }
    }
    
    public void clear(int n, boolean comp){
        if(n>=0){
            if(comp==true){
                for(int i=0; i<matriz.length; i++){
                    matriz[i][n]=0;
                }
            }else{
                for(int i=0; i<matriz[n].length; i++){
                    matriz[n][i]=0;
                }
            }
        }
    }
    
}
