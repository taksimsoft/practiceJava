package exception;

import java.util.NoSuchElementException;

public class ExceptionTest {
  public static void main(String[] args) {

      try{
          getException();
      }catch (RuntimeException  e){
      System.out.println(e);
      }

  }

    private static void getException() {

      getException2();

    }

    private static void getException2() {
        throw new NoSuchElementException();
  }
}
