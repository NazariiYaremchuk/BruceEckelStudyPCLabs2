package Exercise7_Main;

import java.util.Random;

public class Coin {
//    static Integer check;

    public static boolean coinFlippingTask7() {
        boolean win;

        Random rnd = new Random();
        win = rnd.nextBoolean();
        System.out.println(win ? "Result:\tOrel" : "Result:\tReshka");
        return win;
    }
}
