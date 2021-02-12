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
        
     //lista de palabras 
    
      for (int i=0; i<listaPalabras[0].length; i++)  { 
        if(listaPalabras [i] [0] == listaPalabras [i+1] [0]){
              System.out.println("Son iguales");
        }
        else{
            System.out.println("Son distintos");
        }
      }
      
        return true;
    }
    
    
    
    
    
    
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      EjerciciosNivel2 ejercicio = new EjerciciosNivel2();
         char [][] listaPalabras = {
        {'P', 'A', 'T', 'A'},
        {'P', 'A', 'T', 'O'},
        {'R', 'A', 'T', 'O'},
        {'R', 'A', 'M', 'O'},
        {'G', 'A', 'M', 'O'},
        {'G', 'A', 'T', 'O'},
        {'M', 'A', 'T', 'O'}
    };
      
        System.out.println(ejercicio.escaleraDePalabras(listaPalabras));
    }
    
}
