import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzListFactory {
    public List transformNumberToList(int number){
        if(number < 1) throw new IllegalArgumentException("number should not be negative");
        if(number == 1)
        return new ArrayList(Arrays.asList(1));
        return new ArrayList(Arrays.asList(1,2));

    }
}
