package Exercise2;
/**
 * Exercise 2: (1) Create a class containing a float and use it to demonstrate aliasing.
 */

public class Exercise2_Main {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9.1f;
        t2.level = 47.1f;

        System.out.println("1: \tt1.level :" + t1.level + "\t\tt2.level : " + t2.level);
        t1=t2;
        System.out.println("2: \tt1.level :" + t1.level + "\t\tt2.level : " + t2.level);
        t1.level = 27.66f;
        System.out.println("3: \tt1.level :" + t1.level + "\t\tt2.level : " + t2.level);

    }
}
