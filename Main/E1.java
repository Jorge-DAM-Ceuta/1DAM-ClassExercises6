package EjerciciosT7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class E1 {
    
    private int [] array;
    
    public void ejercicio1p1(){
        try{
        
            File f = new File("/home/jorge/Escritorio/numeros.txt");
            
            if(f.isFile() && f.canRead()){
                array = new int [10];
                FileReader fr = new FileReader(f); 
                BufferedReader br = new BufferedReader(fr);
                String linea;
                int i=0;
                
                while((linea = br.readLine())!=null){
                    
                    if(i<array.length){
                        array[i]=Integer.parseInt(linea);
                        i++;
                    }
                }
                
                br.close();
                fr.close();
            }
        }catch(IOException error){
            System.err.println(error);
        }
    }
    
    public void ejercicio1p2(){
        
        for(int i=0; i<array.length; i++){
            System.out.println("La casilla " + i + " contiene el valor: " + array[i]);
        }
        
    } 
    
    public int ejercicio2(int i, String opcion){
        
        int resultado=0;
        
        if(i>0){
            
            int [] array = new int [i];
            
            try{
        
                File f = new File("/home/jorge/Escritorio/numeros.txt");

                if(f.isFile() && f.canRead()){
                    FileReader fr = new FileReader(f); 
                    BufferedReader br = new BufferedReader(fr);
                    String linea;
                    int j=0;

                    while((linea = br.readLine())!=null){

                        if(j<array.length){
                            array[j]=Integer.parseInt(linea);
                            j++;
                        }
                    }

                    br.close();
                    fr.close();
                }
            }catch(IOException error){
                System.err.println(error);
            }
            
            switch(opcion){
                
                case "Media artimetica":
                    for(int x=0; x<array.length; x++){
                        resultado += array[x];
                    }
                    resultado = resultado/array.length;
                break;
                    
                
                case "Maximo":
                    
                    int maximo = 0;
                    
                    for(int x=0; x<array.length; x++){
                    
                        if(array[x]>maximo){
                            maximo = array[x];
                        }
                        
                    }
                    
                    resultado = maximo;
                    
                break;

                    
                case "Minimo":
                    
                    int minimo = 999999999;
                    
                    for(int x=0; x<array.length; x++){
                    
                        if(array[x]<minimo){
                            minimo = array[x];
                        }
                        
                    }
                    
                    resultado = minimo;
                    
                break;

                
                case "Moda":
                    
                    int repeticiones=0, posicion=0, valor=0, repeticionesMaximas=0;
                    
                    for(int x=0; x<array.length; x++){
                        valor=array[x];
                        
                        for(int k=0; k<array.length; k++){
                            if(array[k]== valor){
                                repeticiones++;
                            }
                        }
                        
                        if(repeticiones>repeticionesMaximas){
                            posicion = x;
                            repeticionesMaximas = repeticiones;
                        }
                        
                        repeticiones = 0;
                        
                        if(repeticionesMaximas==1){
                            resultado=-1;
                        }else{
                            resultado=array[posicion];
                        }
                    }
                break;
                    
                
                case "Mediana":
                    resultado = array[array.length/2];
                break;
            }
        }
        
        return resultado;
    }
    
    public String ejercicio3(){
        
        Scanner scan = new Scanner(System.in);
        char [] array = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int teclado = 0;
        String resultado = "";
        
        
        while(teclado!=-1){
            System.out.println("Introduce un numero");
            teclado = scan.nextInt();

            if(teclado>=0 && teclado<=25){
                resultado += array[teclado];
            }else{
                System.out.println("");
            }
        }
        
        System.out.println(resultado);
        return resultado;
    }
    
    public char ejercicio4(int dni){ //Tecnica SEO
        
        char [] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = dni%23;
        
        return letra[resto];
    
    }
    
    
}
