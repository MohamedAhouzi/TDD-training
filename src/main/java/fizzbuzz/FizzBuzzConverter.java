package fizzbuzz;

public class FizzBuzzConverter {

    public  String convert(Integer number){
        return (number %  3 == 0 && number % 5 ==0) ? "FizzBuzz" :
        number % 3 == 0 ?  "Fizz" :
        number % 5 == 0 ?  "Buzz" : number.toString() ;
    }
}
