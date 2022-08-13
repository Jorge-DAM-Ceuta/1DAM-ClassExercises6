package EjerciciosT7;

public class Matrices {
    
    private int [] [] notas;
    
    public Matrices(){
        
        notas = new int [15] [3];
    }
    
    public int [] getNotas(int alumno) {
       
        int [] notasAlumno = new int [3];
        
        for(int i=0; i<3; i++){
            notasAlumno[i] = notas[alumno] [i]; 
        }
        
        return notasAlumno;
    }

    public void setNotas(int alumno, int nota1, int nota2, int nota3) {
        
        if(alumno>=0 && alumno<15){
            notas[alumno][0]=nota1;
            notas[alumno][1]=nota2;
            notas[alumno][2]=nota3;
        }else{
            System.err.println("Posicion de la matriz no valida");
        }
    }
    
    public void leerMatriz(){
        
        for(int i=0; i<15; i++){
            System.out.println("Notas del alumno " + i + ": ");
            for(int j=0; j<3;j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    
//Ejercicio 9
    
    public double mediaCalificacion1(int nota){
        double resultado=0;
        
        for(int i=0; i<15; i++){
            resultado+=notas [i] [nota];
        }
        
        return resultado/15;
    }
    
    public int mediaAlumno2 (int alumn){
        int resultado= notas [alumn] [0] + notas [alumn] [1] + notas [alumn] [2];
        
        return resultado/3;
    }
    
    public int mediaClase3(){
        int resultado=0;
        
        for(int i=0; i<15; i++){
            for(int j=0; j<3; j++){
                resultado+=notas [i] [j];
            }
        }
        
        return resultado/45;
    }
    
    public int maximaCalificacion4(int nota){
        int maximo = 0;
                    
            for(int i=0; i<15; i++){
                    
                if(notas[i][nota]>maximo){
                    maximo = notas[i][nota];
                }
                        
            }
                    
        int resultado = maximo;
        return resultado;
    }
    
    public int minimaCalificacion5(int nota){
        int minimo = 100000000;
                    
            for(int i=0; i<15; i++){
                    
                if(notas[i][nota]<minimo){
                    minimo = notas[i][nota];
                }
                        
            }
                    
        int resultado = minimo;
        return resultado;
    }
    
    public int countAprobados6(){
        int aprobados = 0;
        
        for(int i=0; i<15; i++){
            if(notas [i] [0] > 3.5 && notas [i] [1] > 3.5 && notas [i] [2] > 3.5){
                if(mediaCalificacion1(i)>=5){
                    aprobados++;
                }
            }
        }
        
        int resultado = aprobados;
        return resultado;
    }
    
    public int countSuspensos7(){
        return 15-countAprobados6();
    }
    
}
