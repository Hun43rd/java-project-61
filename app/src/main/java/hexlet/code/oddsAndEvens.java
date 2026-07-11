package hexlet.code;

import java.util.Random;
import java.util.Scanner;

class Game2 {
    public static void evenGame(String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (var i = 0; i < 3; i++) {
            int number = random.nextInt(100) + 1;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            boolean isEven = number % 2 == 0;
            String correctAnswer = isEven ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                return;
            }
        }

        scanner.close();
        System.out.println("Congratulations, " + name + "!");
    }
}
