package hexlet.code;

class Engine {
    public static void gameChoose(String userName, int gameNumber) {
        switch (gameNumber) {
            case 2:
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case 3:
                System.out.println("What is the result of the expression?");
                break;
            case 4:
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case 5:
                System.out.println("What number is missing in the progression?");
                break;
            case 6:
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            default:
                return;
        }

        for (int i = 0; i < 3; i++) {
            int res;
            switch (gameNumber) {
                case 2:
                    res = Game2.evenGame();
                    break;
                case 3:
                    res = Game3.calcGame();
                    break;
                case 4:
                    res = Game4.GCD();
                    break;
                case 5:
                    res = Game5.progression();
                    break;
                case 6:
                    res = Game6.Prime();
                    break;
                default:
                    return;
            }

            if (res == 1) {
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
