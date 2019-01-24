package Exercise4;
import java.util.Scanner;
/**
 * Exercise 4: (2) Write a program that calculates velocity using a constant distance and a
 * constant time.
 */


public class Exercise4_Main {
    public static void main(String[] args) {
        double speed, distance, time;
        int minTime = 0, maxTime = 10;
        Scanner in = new Scanner(System.in);

        System.out.println("Calculator of speed(V=S/T)");
        time = minTime + (int) (Math.random() * maxTime);
        System.out.println("Generated time: " + time + " hours");
        System.out.println("Enter distanse: ");
        distance = in.nextInt();
        speed = distance / time;
        System.out.println("Speed:\t" + speed + "km/h");


        System.out.println("\nCalculator of time(T=S/V)");
        Scanner in1 = new Scanner(System.in);
        int speed1;
        double distance1, time1;
        int minSpeed = 0, maxSpeed = 120;

        speed1 = minSpeed + (int) (Math.random() * maxSpeed);
        System.out.println("Generated speed: " + speed1 + " km/h");
        System.out.println("Enter distance");
        distance1 = in.nextInt();
        time1 = distance1 / speed1 * 60;
        System.out.println("Time\t" + time1 + " min");


        int speed2;
        double distance2;
        System.out.println("\nCalculator of distance(S=V*T)");
        time = minTime + (int) (Math.random() * maxTime);
        System.out.println("Generated speed: " + time + " hours");
        System.out.println("Enter speed: ");
        speed2 = in.nextInt();
        distance2 = speed2 * time;
        System.out.println("Distance:\t" + distance2 + "km");
    }
}