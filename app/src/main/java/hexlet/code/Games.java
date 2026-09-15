package hexlet.code;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

class RandomNumber {
    public static int getNumber() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        return number;
    }
}

class Game2 {
    public static int evenGame() {
        Scanner scanner = new Scanner(System.in);

        int number = RandomNumber.getNumber();
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();

        boolean isEven = number % 2 == 0;
        String correctAnswer = isEven ? "yes" : "no";

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return 0;
        } else {
            System.out.println(
                    "'"
                            + answer
                            + "' is wrong answer;(. Correct answer was '"
                            + correctAnswer
                            + "'.");
            return 1;
        }
    }
}

class Game3 {
    public static int calcGame() {
        Random random = new Random();
        List<String> list = List.of("*", "+", "-");
        Scanner scanner = new Scanner(System.in);

        String randomElement = list.get(random.nextInt(list.size()));

        int firstNumber = RandomNumber.getNumber();
        int secondNumber = RandomNumber.getNumber();

        String text = firstNumber + " " + randomElement + " " + secondNumber;
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
            return 0;
        } else {
            System.out.println(
                    "'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            return 1;
        }
    }
}

class Game4 {
    public static int GCD() {
        int a = RandomNumber.getNumber();
        int b = RandomNumber.getNumber();
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        int c = 0;

        String text = a + " " + b;
        System.out.println("Question: " + text);
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();

        while (b != 0) {
            c = a;
            a = b;
            b = c % b;
        }
        res = a;

        if (res == answer) {
            System.out.println("Correct!");
            return 0;
        } else {
            System.out.println(
                    "'" + answer + "' is wrong answer ;(. Correct answer was '" + res + "'.");
            return 1;
        }
    }
}

class Game5 {
    public static int progression() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int step = random.nextInt(10) + 1;
        int length = random.nextInt(5, 11);
        int start = RandomNumber.getNumber();
        String[] newArray = arrayCreation(length, step, start);
        int missingPart = random.nextInt(length);
        int res = Integer.parseInt(newArray[missingPart]);
        newArray[missingPart] = "..";

        System.out.println("Question: " + String.join(" ", newArray));
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();

        if (res == answer) {
            System.out.println("Correct!");
            return 0;
        } else {
            System.out.println(
                    "'" + answer + "' is wrong answer ;(. Correct answer was '" + res + "'.");
            return 1;
        }
    }

    public static String[] arrayCreation(int length, int step, int start) {
        int[] array = new int[length];
        String[] stringArray = new String[length];
        stringArray[0] = String.valueOf(start);
        array[0] = start;

        for (var i = 1; i < length; i++) {
            array[i] = array[i - 1] + step;
            stringArray[i] = String.valueOf(array[i]);
        }
        return stringArray;
    }
}

class Game6 {
    public static int Prime() {
        Scanner scanner = new Scanner(System.in);
        int number = RandomNumber.getNumber();
        boolean isSimple = Game6.isSimple(number);

        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String answer = scanner.nextLine();

        String correctAnswer = isSimple ? "yes" : "no";

        if (correctAnswer.equals(answer)) {
            System.out.println("Correct!");
            return 0;
        } else {
            System.out.println(
                    "'"
                            + answer
                            + "' is wrong answer;(. Correct answer was '"
                            + correctAnswer
                            + "'.");
            return 1;
        }
    }

    public static boolean isSimple(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
