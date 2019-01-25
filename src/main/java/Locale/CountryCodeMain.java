package Locale;

import java.util.Arrays;
import java.util.Locale;
import java.util.function.Consumer;

public class CountryCodeMain {

  public static void main(String[] args) {

      System.out.println(Locale.UK.getISO3Country());

      String[] isoCountries = Locale.getISOCountries();
      for (String country : isoCountries) {
          Locale locale = new Locale("en", country);
          String iso = locale.getISO3Country();
          String code = locale.getCountry();
          String name = locale.getDisplayCountry();

          System.out.println(iso + " " + code + " " + name);

      }
  }
}
