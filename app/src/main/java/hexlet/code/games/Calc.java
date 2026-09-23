package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calc {
    public static void game() {
        String text = "What is the result of the expression?";
        String[][] qaArray = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            String randomElement = RandomUtils.getSymbol();
            int firstNumber = RandomUtils.getNumber();
            int secondNumber = RandomUtils.getNumber();

            String expressionText = firstNumber + " " + randomElement + " " + secondNumber;
            qaArray[i][0] = expressionText;
            qaArray[i][1] = String.valueOf(getExpression(firstNumber, secondNumber, randomElement));
        }
        Engine.gameEngine(text, qaArray);
    }

    public static int getExpression(int firstNumber, int secondNumber, String randomElement) {
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
                throw new RuntimeException("Unknown symbol: " + randomElement);
        }
        return result;
    }
}
