package hexlet.code;

class Gcd {
    public static void game() {
        String text = "Find the greatest common divisor of given numbers.";
        String[][] qaArray = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int a = RandomUtils.getNumber();
            int b = RandomUtils.getNumber();
            String textGcd = a + " " + b;

            qaArray[i][0] = textGcd;
            qaArray[i][1] = String.valueOf(gcd(a, b));
        }
        Engine.gameEngine(text, qaArray);
    }

    public static int gcd(int a, int b) {
        int c = 0;

        while (b != 0) {
            c = a;
            a = b;
            b = c % b;
        }
        return a;
    }
}
