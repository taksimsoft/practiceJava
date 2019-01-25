package reference;

class Swap {

    public void swap(A a, A b){
        System.out.println( "Swap" + a + " " + b);

        A c = a;
        a =  b;
        b = c;

        System.out.println( "Swap" + a + " " + b);

    }
}
