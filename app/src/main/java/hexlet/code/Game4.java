package hexlet.code;

class Game4 {
    public static void gcd() {
        String text = "Find the greatest common divisor of given numbers.";
        String[][] qaArray = new String[3][2];

        for (int i = 0; i < qaArray.length; i++) {
            int a = RandomNumber.getNumber();
            int b = RandomNumber.getNumber();
            String textGcd = a + " " + b;

            qaArray[i][0] = textGcd;
            qaArray[i][1] = getGcdRes(a, b);
        }
        Engine.gameEngine(text, qaArray);
    }

    public static String getGcdRes(int a, int b) {
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
