package Exercise14;

/**
 * Exercise 14: (3) Write a method that takes two String arguments and uses all the
 * boolean comparisons to compare the two Strings and print the results. For the == and !=,
 * also perform the equals( ) test. In main( ), call your method with some different String
 * objects.
 */

public class Exercise14_Main {
    public static void main(String[] args) {
        CompareString compareString = new CompareString();

        compareString.compare("a", "a");
        compareString.compare("a", "b");
    }
}
