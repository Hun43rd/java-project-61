package hexlet.code;

import java.util.Random;

class RandomNumber {
    public static int getNumber() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        return number;
    }
}
