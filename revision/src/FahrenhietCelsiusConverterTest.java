import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by abbyr on 27/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class FahrenhietCelsiusConverterTest
{
   @Test
   void shouldConvertCelsiusToFahrenheit() {
      assertThat(FahrenheitCelsiusConverter.toFahrenheit(0)).isEqualTo(32);
      assertThat(FahrenheitCelsiusConverter.toFahrenheit(37)).isEqualTo(98);
      assertThat(FahrenheitCelsiusConverter.toFahrenheit(100)).isEqualTo(212);
   }
   @Test
   void shouldConvertFahrenheitToCelsius() {
      assertThat(FahrenheitCelsiusConverter.toCelsius(32)).isEqualTo(0);
      assertThat(FahrenheitCelsiusConverter.toCelsius(100)).isEqualTo(37);
      assertThat(FahrenheitCelsiusConverter.toCelsius(212)).isEqualTo(100);
   }


}//class
