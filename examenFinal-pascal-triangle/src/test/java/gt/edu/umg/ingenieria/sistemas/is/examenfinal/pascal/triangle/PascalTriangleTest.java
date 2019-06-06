package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class PascalTriangleTest {
    @Test
    public void testZero() {
        System.out.println("Prueba comparando 0 niveles");
        int levels = 0;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "[]";
        String result = instance.build(levels);
        assertEquals("Intento Fallido, resultado obtenido: "+result,expResult, result);

    }
    
    @Test
    public void testNegative() {
        System.out.println("Prueba con numeros negativos");
        int levels = -2;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "[]";
        String result = instance.build(levels);
        assertEquals("Intento Fallido, resultado obtenido: "+result,expResult, result);
    }
    
    @Test
    public void testNormalSize() {
        System.out.println("Prueba comparando cadena de resultados de 2 numeros");
        int levels = 2;
        PascalTriangle instance = new PascalTriangle();
        String expResult = "[1]\n[1, 1]\n";
        String result = instance.build(levels);
        assertEquals("Intento Fallido, resultado obtenido: "+result,expResult, result);
        
    }
    
    @Test
    public void testLevelAmount() {
        System.out.println("Prueba verificando candidad de nieles obtenidos");
        int levels =10;
        PascalTriangle instance = new PascalTriangle();        
        String result = instance.build(levels);
        int counter = 0; 
        for(char c: result.toCharArray()){
            if(c=='\n')
            {
                counter++;
            }
        }
        assertTrue(counter==levels);        
    }
    
    @Test
    public void testSimbols() {
    System.out.println("Prueba verificando que se cierre cada [");
        int levels =10;
        PascalTriangle instance = new PascalTriangle();        
        String result = instance.build(levels);
        int counter = 0; 
        for(char c: result.toCharArray()){
            if(c=='[')
            {
                counter++;
            }
            if(c==']')
            {
                counter--;
            }
        }
        assertTrue(counter==0);        
    }    
    

    
}
