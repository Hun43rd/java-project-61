package hexlet.code;

class Gcd {
    public static void game() {
        String text = "Find the greatest common divisor of given numbers.";
        String[][] qaArray = new String[3][2];

        for (int i = 0; i < qaArray.length; i++) {
            int a = RandomUtility.getNumber();
            int b = RandomUtility.getNumber();
            String textGcd = a + " " + b;

            qaArray[i][0] = textGcd;
            qaArray[i][1] = gcd(a, b);
        }
        Engine.gameEngine(text, qaArray);
    }

    public static String gcd(int a, int b) {
        int res = 0;
        int c = 0;

        while (b != 0) {
            c = a;
            a = b;
            b = c % b;
        }
        res = a;
        return String.valueOf(res);
    }
}
