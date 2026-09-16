package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println(
                "Please enter the game number and press Enter.\n"
                        + "1 - Greet\n"
                        + "2 - Even\n"
                        + "3 - Calc\n"
                        + "4 - GCD\n"
                        + "5 - Progression\n"
                        + "6 - Prime\n"
                        + "0 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int game = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nWelcome to the Brain Games!");
        String userName = Cli.getName();

        Engine.gameChoose(userName, game);

        scanner.close();
    }
}

class Cli {
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
