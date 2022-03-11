package fizzbuzz;

import java.util.List;

public class FizzBuzzEngine {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
    FizzBuzzListFactory fizzBuzzListFactory = new FizzBuzzListFactory();
    public void show(int number) {
        List<Integer> numbers = fizzBuzzListFactory.transformNumberToList(number);
       for(Integer i : numbers){
           String convertedNumber = fizzBuzzConverter.convert(i);
           System.out.println(i+"=>"+convertedNumber);
       }

    }
}
