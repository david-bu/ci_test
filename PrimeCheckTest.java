import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    int[] primes = { 2, 3, 5, 11, 23 };
    for (int prime : primes) {
      assertTrue("Test prime " + prime, PrimeCheck.isPrime(prime));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    int[] nonPrimes = { 4, 6, 9, 15, 25 };
    for (int nonPrime : nonPrimes) {
      assertFalse("Test non prime " + nonPrime, PrimeCheck.isPrime(nonPrime));
    }
  }
}
