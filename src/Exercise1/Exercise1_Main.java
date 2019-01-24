package Exercise1;

import java.util.Scanner;
/**
 * Напишіть программу,в якій використовуються як і "Короткі ",так і "Довгі" команди друку
 */

public class Exercise1_Main {
    public static void main(String[] args) {
        System.out.print("Command System.out.println:\n");
        System.out.println("Hello world!");
        System.out.println("It's me");
//        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.print("Command System.out.print:\n");
        System.out.print("Hello world!");
        System.out.print("Bye,world");
//        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        int x = 5, y = 7;
        System.out.printf("\nx=" + x + "; y =" + y);
//        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.printf("\nx = %d\ty = %d",x,y);
//        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter the number :");
        int num = in.nextInt();
        System.out.printf("Your number is %d\n",num);
        System.out.println("\n\nThanks for watching :)");
    }

}
