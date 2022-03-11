package fizzbuzz;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class FizzBuzzEngineTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    FizzBuzzEngine fizzBuzzEngine = new FizzBuzzEngine();

    @Test
    public void shouldPrint1_1WhenGiven1(){

        fizzBuzzEngine.show(1);
        assertEquals("1=>1", systemOutRule.getLog().trim());


    }
    @Test
    public void shouldPrint1_1And2_2WhenGiven2(){

        fizzBuzzEngine.show(2);
        assertEquals("1=>1\r\n2=>2", systemOutRule.getLog().trim());

    }
    @Test
    public void shouldPrint1_1And2_2And3_FizzWhenGiven3(){

        fizzBuzzEngine.show(3);
        assertEquals("1=>1\r\n2=>2\r\n3=>Fizz", systemOutRule.getLog().trim());

    }
    @Test
    public void shouldPrint1_1And2_2And3_FizzAnd4_4And5_BuzzWhenGiven5(){

        fizzBuzzEngine.show(5);
        assertEquals("1=>1\r\n2=>2\r\n3=>Fizz\r\n4=>4\r\n5=>Buzz", systemOutRule.getLog().trim());

    }
}
