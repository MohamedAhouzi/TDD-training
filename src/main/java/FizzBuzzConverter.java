public class FizzBuzzConverter {

    public static String convert(Integer number){
        return (number %  3 == 0 && number % 5 ==0) ? "FizzBuzz" :
        number % 3 == 0 ?  "Fizz" :
        number % 5 == 0 ?  "Buzz" : number.toString() ;
    }
}
