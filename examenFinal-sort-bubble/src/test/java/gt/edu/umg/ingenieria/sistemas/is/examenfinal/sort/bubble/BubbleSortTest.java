package gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    
    @Test
    public void testSortBasic() {
        System.out.println("Envio Nulo");
        int[] numbers = null;
        int[] expResult = null;
        int[] result = BubbleSort.sortBasic(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testEmpty() {
        System.out.println("Envio cadena vacia");
        int[] numbers = {};
        int[] expResult = {};
        int[] result = BubbleSort.sortBasic(numbers);
        assertArrayEquals(""+Arrays.toString(result),expResult, result);
    }
    
    @Test
    public void testEqualNumbers() {
        System.out.println("Envio cadena con numeros iguales");
        int[] numbers = {1,1,1};
        int[] expResult = {1,1,1};
        int[] result = BubbleSort.sortBasic(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testNormalNumbers() {
        System.out.println("Envio cadena {9,3,10,0,-2}");
        int[] numbers = {9,3,10,0,-2};
        int[] expResult = {-2,0,3,9,10};
        int[] result = BubbleSort.sortBasic(numbers);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSize() {
        System.out.println("verificar tam de cadena de respuesta");
        int[] numbers = {9,3,10,0,-2};
        int expResult = 5;
        int[] result = BubbleSort.sortBasic(numbers);
        int res = result.length;
        assertEquals(expResult, res);
    }
    
}
