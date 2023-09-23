import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;


public class ConversionTest {

  conversion convert = new conversion();
  
  // test what happens when a user enters in a non-number for the value to convert
  @Test(expected = IllegalArgumentException.class)
  public void testAccuracyInput() {
    String invalid = "invalid"; 
    int accuracy = 2; 
    float result = convert.accuracy(Float.parseFloat(invalid), accuracy);
  }

  // test what happens when a user enters in a number outside the range of 0 to 4 for the accuracy  
  @Test(expected = IllegalArgumentException.class)
  public void testAccuracyInput2(){
    float val = 123.45f; 
    int accuracy = 5; 
    float invalid = convert.accuracy(val, accuracy);
  }

  // test what happens when a user enters in a non-number for the accuracy value 0-4 
  @Test(expected = IllegalArgumentException.class)
  public void testAccuracyInput3(){
    float val = 123.45f; 
    String invalid = "invalid"; 
    float result = convert.accuracy(val, Integer.parseInt(invalid));
  }

  // test the actual output of the accuracy method 
  @Test
  public void testAccuracy(){
    float val = 123.45678f; 
    int accuracy = 2; 
    float concat = convert.accuracy(val, accuracy); 
    float expected = 123.46f; 
    float delta = 0.0001f; 
    assertEquals(expected, concat, delta); 
  }

  // test the actual output of each of the conversion methods 

  @Test
  public void testF2C(){
    float fahrenheit = 123.45f; 
    float celsius = convert.convertF2C(fahrenheit); 
    float expected = 50.80555f; 
    float delta = 0.01f; 
    assertEquals(expected, celsius, delta); 
  }
  @Test
  public void testC2F(){
    float celsius = 123.45f; 
    float fahrenheit = convert.convertC2F(celsius); 
    float expected = 254.21f; 
    float delta = 0.01f; 
    assertEquals(expected, fahrenheit, delta); 
  }

  @Test
  public void testIn2Cm(){
    float inches = 123.45f; 
    float centimeters = convert.convertIn2Cm(inches); 
    float expected = 313.563f; 
    float delta = 0.01f; 
    assertEquals(expected, centimeters, delta); 
  }
  
  @Test
  public void testCm2In(){
    float centimeters = 123.45f; 
    float inches = convert.convertCm2In(centimeters); 
    float expected = 48.60236f; 
    float delta = 0.01f; 
    assertEquals(expected, inches, delta); 
  }

  @Test
  public void testF2M(){
    float feet = 123.45f; 
    float meters = convert.convertF2M(feet); 
    float expected = 37.62756f; 
    float delta = 0.01f; 
    assertEquals(expected, meters, delta); 
  }

  @Test
  public void testM2F(){
    float meters = 123.45f; 
    float feet = convert.convertM2F(meters); 
    float expected = 405.01969f; 
    float delta = 0.1f; 
    assertEquals(expected, feet, delta); 
  }
  @Test
  public void testM2K(){
    float miles = 123.45f; 
    float kilometers = convert.convertM2K(miles); 
    float expected = 198.67352f; 
    float delta = 0.1f; 
    assertEquals(expected, kilometers, delta); 
  }
  @Test
  public void testK2M(){
    float kilometers = 123.45f; 
    float miles = convert.convertK2M(kilometers); 
    float expected = 76.72467f; 
    float delta = 0.1f; 
    assertEquals(expected, miles, delta); 
  }
  @Test
  public void testG2L(){
    float gallons = 123.45f; 
    float liters = convert.convertG2L(gallons); 
    float expected = 467.30908f; 
    float delta = 0.1f; 
    assertEquals(expected, liters, delta); 
  }
  @Test
  public void testL2G(){
    float liters = 123.45f; 
    float gallons = convert.convertL2G(liters); 
    float expected = 32.61203f; 
    float delta = 0.01f; 
    assertEquals(expected, gallons, delta);
  }
  @Test
  public void testOz2G(){
    float ounce = 123.45f; 
    float gallons = convert.convertOz2G(ounce); 
    float expected = 3499.8074f; 
    float delta = 0.1f; 
    assertEquals(expected, gallons, delta);
  }
  @Test
  public void testG2Oz(){
    float gallons = 123.45f; 
    float ounces = convert.convertG2Oz(gallons); 
    float expected = 4.35449f; 
    float delta = 0.1f; 
    assertEquals(expected, ounces, delta);

  }
  @Test
  public void testLb2K(){
    float pounds = 123.45f; 
    float kilograms = convert.convertLb2K(pounds); 
    float expected = 55.99597f; 
    float delta = 0.01f; 
    assertEquals(expected, kilograms, delta);
  }
  @Test
  public void testK2Lb(){
    float kilograms = 123.45f; 
    float pounds = convert.convertK2Lb(kilograms); 
    float expected = 272.16066f; 
    float delta = 0.01f; 
    assertEquals(expected, pounds, delta);
  }
  
  @Test
  public void testH2S(){
    float hours = 123.45f; 
    float seconds = convert.convertH2S(hours); 
    float expected = 444420f; 
    float delta = 0.01f; 
    assertEquals(expected, seconds, delta);
  }

  @Test
  public void testS2H(){
    float seconds = 123.45f; 
    float hours = convert.convertS2H(seconds); 
    float expected = 0.03429f; 
    float delta = 0.01f; 
    assertEquals(expected, hours, delta);
  }
}
