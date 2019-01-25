package structuralpattern.proxy;

public class ExpensiveObjectImp implements ExpensiveObject {

    public ExpensiveObjectImp() {
        heavyInitialization();
    }

    private void heavyInitialization() {
        System.out.println("HEAVY Initialization....");
    }

    @Override
    public void process() {
        System.out.println("ExpensiveObjectImp");
    }
}
