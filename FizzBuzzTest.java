import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
	public void returnsOneIfGivenOne() {
  Fizzbuzz fizzbuzz = new Fizzbuzz();
  String result = fizzbuzz.getResult(1);
  assertEquals("1", result);
}
}

//refactor
