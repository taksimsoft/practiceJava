package reference;

public class PassedByValueOrReference {

  public static void main(String[] args) {

      A    a = new A();
      A    b = new A();
      Swap s = new Swap();
      PassedByValueOrReference test = new PassedByValueOrReference();

      a.name = "a";
      b.name = "b";

      System.out.println(" main 1 " +  a + " " + b);
//      test.swap(a,b);
      s.swap(a,b);
      System.out.println(" main 2 "  + a + " " + b);
  }

    private void swap(A x, A y) {
        System.out.println(x + " " + y);
        A c;
        c = x;
        x = y;
        y = c;

        x.name = "c";


        System.out.println(x + " " + y);

    }



}
