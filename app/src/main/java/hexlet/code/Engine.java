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
            default:
                break;
        }

        for (int i = 0; i < 3; i++) {
            switch (gameNumber) {
                case 2:
                    Game2.evenGame();
                    break;
                case 3:
                    Game3.calcGame();
                    break;
                default:
                    break;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
