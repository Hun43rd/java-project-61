package hexlet.code;

class Game6 {
    public static void prime() {
        String text = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] qaArray = new String[3][2];

        for (int i = 0; i < qaArray.length; i++) {
            int number = RandomNumber.getNumber();
            boolean isSimple = Game6.isSimple(number);

            qaArray[i][0] = String.valueOf(number);
            qaArray[i][1] = isSimple(number) ? "yes" : "no";
        }
        Engine.gameEngine(text, qaArray);
    }

    public static boolean isSimple(int number) {
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
