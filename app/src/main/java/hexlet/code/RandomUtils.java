package hexlet.code;

import java.util.List;
import java.util.Random;

public class RandomUtils {
    private static final Random RANDOM = new Random();

    public static int getNumber() {
        return RANDOM.nextInt(100) + 1;
    }
    public static int getNumber(int length) {
        return RANDOM.nextInt(length);
    }
    public static String getSymbol() {
        List<String> list = List.of("*", "+", "-");
        return list.get(RANDOM.nextInt(list.size()));
    }
    public static int getStepForArray() {
        return RANDOM.nextInt(10) + 1;
    }
    public static int getLengthForArray() {
        return RANDOM.nextInt(5, 11);
    }
}
