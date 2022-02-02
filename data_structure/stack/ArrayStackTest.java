import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayStackTest {

    @Test
    public void first_makeStack(){

        ArrayStack array = new ArrayStack();
        final int[] testArr = new int[1]; 
        assertArrayEquals(array.getArray(), testArr);
        
    }

}
