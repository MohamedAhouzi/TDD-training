public class FizzBuzzListFactory {
    public void transformNumberToList(int number){
        if(number < 1) throw new IllegalArgumentException("number should not be negative");
    }
}
