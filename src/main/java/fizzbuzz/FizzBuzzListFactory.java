package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzListFactory {
    public List<Integer> transformNumberToList(int number){

        if(number < 1) throw new IllegalArgumentException("number should not be negative");
        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 1; i <= number; i++){
            listOfNumbers.add(i);
        }
        return listOfNumbers;

    }
}
