public class FizzBuzzConverter {

    public static String convert(int number){
        if(number % 3 == 0) return "Fizz";
        if(number % 5 == 0) return "Buzz";
        return "1" ;
    }
}
