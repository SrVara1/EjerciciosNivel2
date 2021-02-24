/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Propietario
 */
public class EjerciciosNivel2Test {
    
    public EjerciciosNivel2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of quitaAcentos method, of class EjerciciosNivel2.
     */
    @Test
    public void testQuitaAcentos() {
        System.out.println("quitaAcentos");
        String cadena = "";
        EjerciciosNivel2 instance = new EjerciciosNivel2();
        String expResult = "";
        String result = instance.quitaAcentos(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escaleraDePalabras method, of class EjerciciosNivel2.
     */
//    @Test
//    public void testEscaleraDePalabras() {
//        System.out.println("escaleraDePalabras");
//        char[][] listaPalabras = null;
//        EjerciciosNivel2 instance = new EjerciciosNivel2();
//        boolean expResult = false;
//        boolean result = instance.escaleraDePalabras(listaPalabras);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of costeErroresADN method, of class EjerciciosNivel2.
     */
//    @Test
//    public void testCosteErroresADN() {
//        System.out.println("costeErroresADN");
//        String uno = "";
//        String dos = "";
//        EjerciciosNivel2 instance = new EjerciciosNivel2();
//        int expResult = 0;
//        int result = instance.costeErroresADN(uno, dos);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of findDuplicate method, of class EjerciciosNivel2.
     */
//    @Test
//    public void testFindDuplicate() {
//        System.out.println("findDuplicate");
//        int[] listaNumeros = null;
//        EjerciciosNivel2 instance = new EjerciciosNivel2();
//        int expResult = 0;
//        int result = instance.findDuplicate(listaNumeros);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of strStr method, of class EjerciciosNivel2.
     */
    @Test
    public void testStrStr() {
        System.out.println("strStr");
        EjerciciosNivel2 instance = new EjerciciosNivel2();
        
        assertEquals(6, instance.strStr("hols Helios!", "el"));
        assertEquals(5, instance.strStr("hols Mundo", "Mun"));
        assertEquals(6, instance.strStr("hola MynMu!", "Mun"));
        assertEquals(6, instance.strStr("hola MMunn!", "Mun"));
        assertEquals(6, instance.strStr("Mumn", "mun"));
       
    }

    /**
     * Test of main method, of class EjerciciosNivel2.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        EjerciciosNivel2.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
