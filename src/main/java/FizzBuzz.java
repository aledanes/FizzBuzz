public class FizzBuzz {

    public String isFizzOrBuzz (int numberTocheck) {

        String result = Integer.toString(numberTocheck);

        if (( numberTocheck %3) == 0)
            result = "Fizz";
        if (( numberTocheck %5) == 0)
            result = "Buzz";
        if ( numberTocheck %3 == 0 && numberTocheck % 5 == 0 )
            result = "FizzBuzz";

        return result;
    }
}
