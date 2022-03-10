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
}
