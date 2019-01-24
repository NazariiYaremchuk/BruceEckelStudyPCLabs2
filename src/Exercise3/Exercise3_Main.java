package Exercise3;
/**
 * Exercise 3: (1) Create a class containing a float and use it to demonstrate aliasing during
 * method calls.
 */

public class Exercise3_Main {
    static void f(Latter y){
        y.c = 011.741f;
    }
    public static void main(String[] args) {
        Latter x = new Latter();
        x.c = 23.1f;
        System.out.println("1:\t x.c: "+x.c);
        f(x);
        System.out.println("2:\t x.c: "+x.c);
    }
}
