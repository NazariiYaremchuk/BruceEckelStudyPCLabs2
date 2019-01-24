package Exercise13;

/**
 * Exercise 13: (1) Write a method that displays char values in binary form. Demonstrate it
 * using several different characters
 */

public class Exercise13_Main {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println(Integer.toBinaryString(a));
        a = 'b';
        System.out.println(Integer.toBinaryString(a));
        a = 'c';
        System.out.println(Integer.toBinaryString(a));
        a = 'd';
        System.out.println(Integer.toBinaryString(a));
        a += 1;
        System.out.println(Integer.toBinaryString(a));
        a = 'A';
        System.out.println(Integer.toBinaryString(a));
        for (int f = 0; f < 26; f++) {
            a += 1;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}
