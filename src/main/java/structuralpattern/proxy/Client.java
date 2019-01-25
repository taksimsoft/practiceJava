package structuralpattern.proxy;

public class Client {

  public static void main(String[] args) {
      ExpensiveObjectProxy objectProxy = new ExpensiveObjectProxy();
      objectProxy.process();
      objectProxy.process();
  }
}
