package hexlet.code;

class Calc {
    public static void game() {
        String text = "What is the result of the expression?";
        String[][] qaArray = new String[3][2];

        for (int i = 0; i < qaArray.length; i++) {
            String randomElement = RandomUtility.getSymbol();
            int firstNumber = RandomUtility.getNumber();
            int secondNumber = RandomUtility.getNumber();

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
