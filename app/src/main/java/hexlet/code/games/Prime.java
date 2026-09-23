package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Prime {
    public static void game() {
        String text = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] qaArray = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = RandomUtils.getNumber();
            boolean isPrime = isPrime(number);

            qaArray[i][0] = String.valueOf(number);
            qaArray[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.gameEngine(text, qaArray);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
