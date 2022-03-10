import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzListFactory {
    public List transformNumberToList(int number){
        if(number < 1) throw new IllegalArgumentException("number should not be negative");
        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 1;i<=number;i++){
            listOfNumbers.add(i);
        }
        return listOfNumbers;

    }
}
