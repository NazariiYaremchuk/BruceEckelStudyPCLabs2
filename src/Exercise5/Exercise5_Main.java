package Exercise5;
/**
 * Exercise 5: (2) Create a class called Dog containing two Strings: name and says. In main(
 * ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”).
 * Then display their names and what they say.
 */

public class Exercise5_Main {
    public static void main(String[] args) {
        Dog firstDog = new Dog();
        Dog nextDog = new Dog();
        firstDog.setName("Spot");
        nextDog.setName("Scruffy");
        firstDog.setSays("Ruff");
        nextDog.setSays("Wurf");
        firstDog.Print();
        nextDog.Print();
    }
}
