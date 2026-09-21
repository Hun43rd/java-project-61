package hexlet.code;

import java.util.Random;

class Progression {
    private static final Random RANDOM = new Random();

    public static void game() {
        String text = "What number is missing in the progression?";
        String[][] qaArray = new String[3][2];

        for (int i = 0; i < qaArray.length; i++) {
            int step = RandomUtility.getStepForArray();
            int length = RandomUtility.getLengthForArray();
            int start = RandomUtility.getNumber();
            int missingPart = RandomUtility.getNumber(length);

            String[] newArray = arrayCreation(length, step, start);
            String res = newArray[missingPart];
            newArray[missingPart] = "..";

            qaArray[i][0] = String.join(" ", newArray);
            qaArray[i][1] = res;
        }
        Engine.gameEngine(text, qaArray);
    }

    public static String[] arrayCreation(int length, int step, int start) {
        String[] stringArray = new String[length];
        stringArray[0] = String.valueOf(start);

        for (var i = 1; i < length; i++) {
            int prev = Integer.parseInt(stringArray[i - 1]);
            stringArray[i] = String.valueOf(prev + step);
        }
        return stringArray;
    }
}
