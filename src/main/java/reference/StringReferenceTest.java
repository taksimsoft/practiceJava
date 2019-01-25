package reference;

public class StringReferenceTest {
      private static String    string1 = "1";
      private static String    string2 = "servet";
      private static String    string3 = "servet";
      private static String    string4 = "servet";

  public static void main(String[] args) {
      System.out.println(string2);
      swapStr(string1,string2);
      System.out.println(string2);
  }

    private static void change(String string1) {
        string1 = "kaassss";
    }

    private static String get() {
        return  "asasa";
    }

    private static void swapStr(String one, String two){
      one = "mehmet";
    }
}
