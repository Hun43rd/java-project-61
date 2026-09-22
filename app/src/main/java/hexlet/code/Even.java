package hexlet.code;

class Even {
    public static void game() {
        String text = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] qaArray = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = RandomUtils.getNumber();

            qaArray[i][0] = String.valueOf(number);
            qaArray[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.gameEngine(text, qaArray);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
