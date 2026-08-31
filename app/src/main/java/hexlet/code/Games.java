package hexlet.code;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Game2 {
    public static void evenGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();

        boolean isEven = number % 2 == 0;
        String correctAnswer = isEven ? "yes" : "no";

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer;(. Correct answer was '" + correctAnswer + "'.");
        }
    }
}

class Game3 {
    public static void calcGame() {
        List<String> list = List.of("*", "+", "-");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String randomElement = list.get(random.nextInt(list.size()));

        int firstNumber = random.nextInt(100) + 1;
        int secondNumber = random.nextInt(100) + 1;

        String text = firstNumber + randomElement + secondNumber;
        System.out.println("Question: " + text);
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();

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

        if (result == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
        }
    }
}
