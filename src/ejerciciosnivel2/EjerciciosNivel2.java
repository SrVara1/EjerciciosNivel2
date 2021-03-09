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
    
    public String quitaAcentos(String cadena){
        // pájaro
        // pajaro
        //cadena = cadena.toLowerCase();
        cadena = cadena.replace('á', 'a');
        cadena = cadena.replace('é', 'e');
        cadena = cadena.replace('í', 'i');
        cadena = cadena.replace('ó', 'o');
        cadena = cadena.replace('ú', 'u');
        cadena = cadena.replace('ü', 'u');
        
        cadena = cadena.replace('Á', 'A');
        cadena = cadena.replace('É', 'E');
        cadena = cadena.replace('Í', 'I');
        cadena = cadena.replace('Ó', 'O');
        cadena = cadena.replace('Ú', 'U');
        cadena = cadena.replace('Ü', 'U');       
        
        
        return cadena;
    }

    
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
     * Metodo de Floyd
     * Encuentra el numero que esta duplicado en una lista de ints
     * @param listaNumeros
     * @return 
     */
    
    // [1,3,2,4,4]
    public int findDuplicate(int []listaNumeros){
        int tortuga = listaNumeros[0];
        int liebre = listaNumeros[0];
        boolean iguales = false;
        while (!iguales){
            tortuga = listaNumeros[tortuga];
            liebre = listaNumeros[listaNumeros[liebre]];
            if (tortuga == liebre){
                iguales = true;
            }
        }
         
        int aux1 = listaNumeros [0];
        int aux2 = tortuga;
        while (aux1 != aux2){
            aux1 = listaNumeros[aux1];
            aux2 = listaNumeros[aux2];

        }
        return aux1;
    }
        
    
    public int strStr (String str1 , String str2 ){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str1 = quitaAcentos(str1);
        int posicion = -1;
        //suponemos que no hay acentos y que todo es minuscula
        
        //este for sirve para que el string 1 vaya avanzando de posición
        for (int i=0; i<str1.length(); i++){
            
           
            if(str1.charAt(i) == str2.charAt(0)){ //si son iguales las letras
                posicion = i; //guardar posicion de la i
                int j=0; //indice para buscar en el str2
                while ( (j<str2.length() && i<str1.length()) && str1.charAt(i) == str2.charAt(j)){ //quetengan letras y que la letra sea igual
                    j++;
                    i++;
                    
                }
                //el while ha terminado y puede haber salido por varias razones
                //la primera, que alguno de los length se haya terminado
                //la segunda, que alguna letra sea distinta
                
                
                if(j >= str2.length()){
                    //si ha salido porque ya notenia mas letras el str2, significa 
                    //que el str2 esta dentro del str1, y ademas su posicion esta guardada
                    //en posicion
                    return posicion;
                    
                }
                 if(i >= str1.length()){
                    //si ha salido porque ya notenia mas letras el str2, significa 
                    //que el str2 de momento NO esta dentro del str1, por eso devolvemos el -1
                    return -1;
                 }
                  if(str1.charAt(i) != str2.charAt(j)){
                    i = posicion;
                    posicion = -1;
                   
                  }
            }
           
                
            
        }
        return posicion;
    }



    public String calculadoraRPN(String [] entrada){
        
        String [] pila =new String [100];
        int posicionPila = 0; // indica el inicio de la pila en el que insertar o leer 
        
        for (int i=0; i< entrada.length; i++){
            
            if (entrada [i] != "+" && entrada[i] != "-" && entrada [i] != "*" && entrada [i] != "/" ){
                //System.out.print(entrada [i] + " ");
                //un operando tengo quemeterlo en la pila
                pila[posicionPila]= entrada [i];
                posicionPila++;
            }
            else{ // es una operacion
                if (posicionPila-2 >=0){
                double operando1 = Double.valueOf(pila [posicionPila-1]);
                double operando2 = Double.valueOf(pila [posicionPila-2]);
                

                if (entrada [i] == "+"){
                    operando1 = operando1 + operando2;
            }
                if (entrada [i] == "-"){
                    operando1 = operando1 - operando2;
            }
                if (entrada [i] == "*"){
                    operando1 = operando1 * operando2;
            }
                if (entrada [i] == "/"){
                    if (operando2 == 0){
                        return "no se puede dividir entre 0 inutil";
                    }
                    else{
                       operando1 = operando1 /operando2;

                    }
            }
            posicionPila = posicionPila -2;
            pila[posicionPila] = operando1+ ""; //guado el resultado en la casilla correspondiente
            posicionPila++;
            }
                else{
                    return "ERROR";
                }
            }
            
        } 
        
        
        return pila[0];
        
    }
    
    
    
    private boolean cabeUnaCaja( boolean[][] camion, int ancho, int alto){
        int altoCamion = camion.length; //filas
        int anchoCamion = camion[0].length; //columnas

        
        for(int i=0; i< altoCamion; i++){
           for (int j =0; j<anchoCamion; j++){
              if (!camion [i][j]){ //Miro si el sitio esta vacio
                  int horizontal=j;
                  int vertical = i;
                  while (vertical - i<alto && vertical < altoCamion && !camion[vertical][horizontal] ){
                      while (horizontal-j<ancho && horizontal <anchoCamion && !camion[vertical][horizontal]){
                          horizontal ++;
                      }
                      if (horizontal - j == ancho){ //si que cabe en esa fila
                         vertical ++;//vuelvo al iniio de 
                         horizontal = j; //la siguiente fila
                      }
                      else {
                          //la caja no cabe y hay que volver alos for
                          vertical=altoCamion*2; //esto es una argucia para indicarle al if fuera del while que la caja no cabe aqui
                                                 // y hay que devolver el control a los for
                      }
                  }
                  if (vertical-i==alto){
                      //si se cumple e poruqe cabe la caja entera
                      return true;
                  }
                  
                  
              }
            }
        }
        return false;
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
        
        System.out.println("------");

        System.out.println(ejercicio.costeErroresADN("ACGT", "TGCA"));
        System.out.println(ejercicio.costeErroresADN("A-C-G-T-ACGT", "TTGGCCAATGCA"));
        System.out.println(ejercicio.costeErroresADN("AAAAAAAA", "TTTATTTT"));
        System.out.println(ejercicio.costeErroresADN("GATTACA", "CTATT-T"));
        System.out.println(ejercicio.costeErroresADN("CAT-TAG-ACT", "GTATATCCAAA"));
        System.out.println(ejercicio.costeErroresADN("--------", "ACGTACGT"));
        System.out.println(ejercicio.costeErroresADN("TAATAA", "ATTATT"));
        System.out.println(ejercicio.costeErroresADN("GGGA-GAATATCTGGACT", "CCCTACTTA-AGACCGGT"));
        
        System.out.println("------");
        
        System.out.println(ejercicio.findDuplicate(new int []{3,2,3,4,1}));
        System.out.println(ejercicio.findDuplicate(new int []{4,2,3,4,1}));
        System.out.println(ejercicio.findDuplicate(new int []{1,1,3,4,1}));
        
        System.out.println("------");
        
        System.out.println(ejercicio.strStr("hola Helios!","el"));
        System.out.println(ejercicio.strStr("hola Mundo!","Mun"));
        System.out.println(ejercicio.strStr("hola MynMu!","Mun"));
        System.out.println(ejercicio.strStr("hola MMunn!","Mun"));
        System.out.println(ejercicio.strStr("Mumn!","mun"));
        
         System.out.println("------");

//        System.out.println(ejercicio.calculadoraRPN (new String [] {"3", "2", "+","7","*"} ));
        System.out.println(ejercicio.calculadoraRPN (new String [] {"4", "2", "/","7","*"} ));
        
        
        
         System.out.println("------");
         
         boolean[][] camion = {
        {true, true, true, true, true, true, true, true},
        {true, true, true, false, false, true, true, true},
        {true, true, true, false, false, true, true, true},
        {true, true, true, false, false, true, false, false},
        {true, true, true, true, true, true, false, false},
         };
         
//         System.out.println(ejercicio.cabeUnaCaja(camion,2, 2));
//         System.out.println(ejercicio.cabeUnaCaja(camion,3, 2));
//         System.out.println(ejercicio.cabeUnaCaja(camion,1, 2));
//         System.out.println(ejercicio.cabeUnaCaja(camion,1, 3));
//         System.out.println(ejercicio.cabeUnaCaja(camion,3, 3));
         System.out.println(ejercicio.cabeUnaCaja(camion,3, 2));

         
    
    
    }
    
    
 
    
    
    
}
