package EjerciciosT7;

public class Buscaminas {
    
    private int [] [] matriz;
    
    public Buscaminas(){
        matriz= new int [9] [9];
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j]=0;
            }
        }
    }
    
    public void rellenaTablero(){
        int bombas=0;
        
        while(bombas<9){
            int fila=(int)(Math.random()*9);
            int columna=(int)(Math.random()*9);
            
            if(matriz[fila][columna]!=-1){
                matriz[fila][columna]=-1;
                bombas++;
            }
        }
    }
    
    public void muestraTablero(){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i][j]; j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
    
}
