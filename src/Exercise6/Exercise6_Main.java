package Exercise6;
/**
 * Exercise 6: (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object.
 * Test for comparison using == and equals( ) for all references.
 */

import Exercise5.Dog;

public class Exercise6_Main {
    public static void main(String[] args) {
        Dog firstDog = new Dog();
        Dog nextDog = new Dog();
        Dog newDog = firstDog;
        firstDog.setName("Spot");
        nextDog.setName("Scruffy");
        firstDog.setSays("Ruff");
        nextDog.setSays("Wurf");
        firstDog.Print();
        nextDog.Print();
        System.out.println(firstDog.equals(newDog) ? "1" : "0");
    }
}
