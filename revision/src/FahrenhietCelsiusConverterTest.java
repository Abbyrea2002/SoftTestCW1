import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

//https://search.maven.org/artifact/org.assertj/assertj-core
/**
 * Created by abbyr on 27/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class FahrenhietCelsiusConverterTest
{

   //runs test multiple times with diff inputs reduces redundancy
  @ParameterizedTest
  @CsvSource({
        "0, 32",
        "37, 98",
        "100, 212",
  })
   void shouldConvertCelsiusToFahrenheit(int celsius, int fahrenheit) {
      //improves readability and flexibility of assertions
     //compares actual value with expected condition
      assertThat(FahrenheitCelsiusConverter.toFahrenheit(celsius)).isEqualTo(fahrenheit);

   }
   @ParameterizedTest
   @CsvSource({
         "32, 0",
         "100, 37",
         "212, 100",
   })
   void shouldConvertFahrenheitToCelsius(int fahrenheit, int celsius) {
      assertThat(FahrenheitCelsiusConverter.toCelsius(fahrenheit)).isEqualTo(celsius);
   }


}//class
