/**
 * Created by abbyr on 27/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class FahrenheitCelsiusConverter
{
   public static int toCelsius(int f){
      int celsius = (f - 32) * 5/9;

      return celsius;
   }

   public static int toFahrenheit(int c){
      int fahrenheit = (c * 9/5) + 32;

      return fahrenheit;
   }
}//class
