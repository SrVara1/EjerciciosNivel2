/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel2;

/**
 *
 * @author Propietario
 */
public class EjerciciosNivel2 {
    
   
    
    public boolean escaleraDePalabras (char [] [] listaPalabras){
        int contador1 = 0;
     //lista de palabras 
    
      for (int i=0; i<listaPalabras.length - 1; i++)  { 
         contador1 = 0; //inicializo el contador de diferencias antes de empezar el bucle 
        for (int j=0; j<listaPalabras[0].length; j++)  { 
            if(listaPalabras [i] [j] == listaPalabras [i+1] [j]){
                System.out.println("Son iguales");
        }
        else{
            System.out.println("Son distintos");
            contador1 ++;//hay una diferencia
        }
      
      }
      
        System.out.println("" + contador1);   
        if (contador1 !=1){ //si e algun momento la palabra se diferencian en mas de un caracter devueve false
            return false;
        }
    }
    return true;
}

    
    public int costeErroresADN(String uno, String dos){
        int coste = 0;//coste de los errores
        
        for(int i=0; i < uno.length(); i++){ 
            if (uno.charAt(i) == 'G'){ 
                if (dos.charAt(i)!= 'C'){ 
                    if (dos.charAt(i) == '-'){ 
                        coste = coste +2; 
                    }
                    else {
                        coste ++;
                    }
                }
            }
        
        
            if (uno.charAt(i) == 'A'){ 
                if (dos.charAt(i)!= 'T'){ 
                    if (dos.charAt(i) == '-'){ 
                      coste = coste +2; 
                    }
                    else {
                        coste ++;
                    }
             }
        }
            
            
             if (uno.charAt(i) == '-'){ 
              coste = coste + 2;
             }
        
        
             if (uno.charAt(i) == 'C'){ 
                if (dos.charAt(i)!= 'G'){ 
                    if (dos.charAt(i) == '-'){ 
                      coste = coste +2; 
                    }
                    else {
                        coste ++;
                    }
             }
        }
             
              if (uno.charAt(i) == 'T'){ 
                if (dos.charAt(i)!= 'A'){ 
                    if (dos.charAt(i) == '-'){ 
                      coste = coste +2; 
                    }
                    else {
                        coste ++;
                    }
             }
        }
        }
    
 
       return coste;
        
    }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      EjerciciosNivel2 ejercicio = new EjerciciosNivel2();
         char [][] listaPalabras = {
        {'P', 'A', 'T', 'A'},
        {'p', 'A', 'T', 'O'},
        {'R', 'A', 'T', 'O'},
        {'R', 'A', 'M', 'O'},
        {'G', 'A', 'M', 'O'},
        {'G', 'A', 'T', 'O'},
        {'M', 'A', 'T', 'O'}
    };
      
        System.out.println(ejercicio.escaleraDePalabras(listaPalabras));
        
        System.out.println(ejercicio.costeErroresADN("ACGT", "TGCA"));
        System.out.println(ejercicio.costeErroresADN("A-C-G-T-ACGT", "TTGGCCAATGCA"));
        System.out.println(ejercicio.costeErroresADN("AAAAAAAA", "TTTATTTT"));
        System.out.println(ejercicio.costeErroresADN("GATTACA", "CTATT-T"));
        System.out.println(ejercicio.costeErroresADN("CAT-TAG-ACT", "GTATATCCAAA"));
        System.out.println(ejercicio.costeErroresADN("--------", "ACGTACGT"));
        System.out.println(ejercicio.costeErroresADN("TAATAA", "ATTATT"));
        System.out.println(ejercicio.costeErroresADN("GGGA-GAATATCTGGACT", "CCCTACTTA-AGACCGGT"));
    }
    
    
    
    
    
    
    
    
}
