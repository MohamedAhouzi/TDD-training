import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest {

    @Test
    public void shouldReturnOneWhenTheInputIs1() {

        String result = FizzBuzzConverter.convert(1);
        Assert.assertEquals(result, "1");
    }
}
