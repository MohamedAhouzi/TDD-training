import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzListFactoryTest {

    @Test
    public void shouldThrowExceptionWhenNumberIsNegative(){
        FizzBuzzListFactory fizzBuzzListFactory = new FizzBuzzListFactory();
        assertThrows(IllegalArgumentException.class,()->{
            fizzBuzzListFactory.transformNumberToList(-5);
        });
    }


}
