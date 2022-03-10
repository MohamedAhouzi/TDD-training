import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest {

    @Test
    public void shouldReturnOneWhenTheInputIs1() {

        String result = FizzBuzzConverter.convert(1);
        Assert.assertEquals(result, "1");
    }

    @Test
    public void shouldReturnFizzWhenTheInputIs3() {

        String result = FizzBuzzConverter.convert(3);
        Assert.assertEquals(result, "Fizz");
    }
    @Test
    public void shouldReturnBuzzWhenTheInputIs5() {

        String result = FizzBuzzConverter.convert(5);
        Assert.assertEquals(result, "Buzz");
    }

    @Test
    public void shouldReturnFizzWhenTheInputIsMultipleOf3() {

        String result = FizzBuzzConverter.convert(6);
        Assert.assertEquals(result, "Fizz");
    }

    @Test
    public void shouldReturnBuzzWhenTheInputIsMultipleOf5() {

        String result = FizzBuzzConverter.convert(10);
        Assert.assertEquals(result, "Buzz");
    }


}
