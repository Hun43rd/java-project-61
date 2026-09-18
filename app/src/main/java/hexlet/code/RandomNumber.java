package hexlet.code;

import java.util.Random;

class RandomNumber {
    private static final Random RANDOM = new Random();
    public static int getNumber() {
        int number = RANDOM.nextInt(100) + 1;
        return number;
    }
}
