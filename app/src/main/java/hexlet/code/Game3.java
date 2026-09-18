package hexlet.code;

import java.util.List;
import java.util.Random;

class Game3 {
    private static final Random RANDOM  = new Random();
    public static void calcGame() {
        String text = "What is the result of the expression?";
        String[][] qaArray = new String[3][2];

        for (int i = 0; i < qaArray.length; i++) {
            List<String> list = List.of("*", "+", "-");
            String randomElement = list.get(RANDOM.nextInt(list.size()));
            int firstNumber = RandomNumber.getNumber();
            int secondNumber = RandomNumber.getNumber();

            String expressionText = firstNumber + " " + randomElement + " " + secondNumber;
            qaArray[i][0] = expressionText;
            qaArray[i][1] = getExpression(firstNumber, secondNumber, randomElement);
        }
        Engine.gameEngine(text, qaArray);
    }

    public static String getExpression(int firstNumber, int secondNumber, String randomElement) {
        int result = 0;

        switch (randomElement) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            default:
                break;
        }
        return String.valueOf(result);
    }
}
