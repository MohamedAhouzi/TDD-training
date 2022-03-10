import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnTheInputWhenTheInputIs1(){
        FizzBuzz fizzBuzz =new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(1);

        Assert.assertEquals(result,"1");
    }
}
