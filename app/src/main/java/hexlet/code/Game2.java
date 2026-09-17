package hexlet.code;

class Game2 {
    public static void evenGame() {
        String text = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] qaArray = new String[3][2];

        for (int i = 0; i < qaArray.length; i++) {
            int number = RandomNumber.getNumber();

            qaArray[i][0] = String.valueOf(number);
            qaArray[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.gameEngine(text, qaArray);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
