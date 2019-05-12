import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {


    @Test
    public void ShouldReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.isFizzOrBuzz(3));
    }

    @Test
    public void ShouldReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.isFizzOrBuzz(5));
    }

    @Test
    public void ShouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("FizzBuzz", fizzBuzz.isFizzOrBuzz(15));
    }

    @Test
    public void ShouldReturnTheNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("4" , fizzBuzz.isFizzOrBuzz(4));
    }

}
