package hexlet.code;

import java.util.Scanner;

class Engine {
    public static void gameEngine(String text, String[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(text);

        for (int i = 0; i < 3; i++) {
            System.out.println("Question: " + array[i][0]);
            System.out.println("Your answer: ");
            var answer = scanner.next();

            if (answer.equals(array[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(
                        "'"
                                + answer
                                + "' is wrong answer ;(. "
                                + "Correct answer was '"
                                + array[i][1]
                                + "'.");
                System.out.println(" Let's try again, " + userName + "!");

                i = 3;
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
