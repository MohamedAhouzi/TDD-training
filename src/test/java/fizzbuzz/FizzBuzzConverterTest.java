package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest {

    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

    @Test
    public void shouldReturnOneWhenTheInputIs1() {

        String result = fizzBuzzConverter.convert(1);
        Assert.assertEquals(result, "1");
    }

    @Test
    public void shouldReturnFizzWhenTheInputIs3() {

        String result = fizzBuzzConverter.convert(3);
        Assert.assertEquals(result, "Fizz");
    }

    @Test
    public void shouldReturnBuzzWhenTheInputIs5() {

        String result = fizzBuzzConverter.convert(5);
        Assert.assertEquals(result, "Buzz");
    }

    @Test
    public void shouldReturnFizzWhenTheInputIsMultipleOf3() {

        String result = fizzBuzzConverter.convert(6);
        Assert.assertEquals(result, "Fizz");
    }

    @Test
    public void shouldReturnBuzzWhenTheInputIsMultipleOf5() {

        String result = fizzBuzzConverter.convert(10);
        Assert.assertEquals(result, "Buzz");
    }

    @Test
    public void shouldReturnFizzBuzzWhenTheInputIs15() {

        String result = fizzBuzzConverter.convert(15);
        Assert.assertEquals(result, "FizzBuzz");
    }

    @Test
    public void shouldReturnFizzBuzzWhenTheInputIsMultipleOf3And5() {

        String result = fizzBuzzConverter.convert(45);
        Assert.assertEquals(result, "FizzBuzz");
    }

    @Test
    public void shouldReturnNumberWhenGivenNUmberNotDivisibleBy3Nor5() {

        String result = fizzBuzzConverter.convert(2);
        Assert.assertEquals(result, "2");
    }


}
