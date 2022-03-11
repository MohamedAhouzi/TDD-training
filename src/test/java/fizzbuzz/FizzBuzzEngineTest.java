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
}
