package fizzbuzz;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FizzBuzzListFactoryTest {
    FizzBuzzListFactory fizzBuzzListFactory = new FizzBuzzListFactory();

    @Test
    public void shouldThrowExceptionWhenNumberIsNegative() {

        assertThrows(IllegalArgumentException.class, () ->
                fizzBuzzListFactory.transformNumberToList(-5));
    }

    @Test
    public void shouldReturnListOf1WhenGivenIs1() {

        List<Integer> list = Collections.singletonList(1);
        assertEquals(list, fizzBuzzListFactory.transformNumberToList(1));
    }

    @Test
    public void shouldReturnListOf1And2WhenGivenIs2() {

        List<Integer> list = Arrays.asList(1, 2);
        assertEquals(list, fizzBuzzListFactory.transformNumberToList(2));
    }

    @Test
    public void shouldReturnListOfNumbersBetween1AndGivenNumber() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        assertEquals(list, fizzBuzzListFactory.transformNumberToList(4));
    }


}
