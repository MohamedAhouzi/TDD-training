import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzListFactoryTest {

    @Test
    public void shouldThrowExceptionWhenNumberIsNegative(){
        FizzBuzzListFactory fizzBuzzListFactory = new FizzBuzzListFactory();
        assertThrows(IllegalArgumentException.class,()->{
            fizzBuzzListFactory.transformNumberToList(-5);
        });
    }

    @Test
    public void shouldReturnListOf1WhenGivenIs1(){
        FizzBuzzListFactory fizzBuzzListFactory = new FizzBuzzListFactory();
        List list = Arrays.asList(1);
        assertEquals(list,fizzBuzzListFactory.transformNumberToList(1));
    }

    @Test
    public void shouldReturnListOf1And2WhenGivenIs2(){
        FizzBuzzListFactory fizzBuzzListFactory = new FizzBuzzListFactory();
        List list = Arrays.asList(1,2);
        assertEquals(list,fizzBuzzListFactory.transformNumberToList(2));
    }






}
