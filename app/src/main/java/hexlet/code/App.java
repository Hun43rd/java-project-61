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

        switch (game) {
            case 1:
                Cli.greet();
                break;
            case 2:
                Game2.evenGame();
                break;
            case 3:
                Game3.calcGame();
                break;
            case 4:
                Game4.gcd();
                break;
            case 5:
                Game5.progression();
                break;
            case 6:
                Game6.prime();
                break;
            default:
                return;
        }
        scanner.close();
    }
}
