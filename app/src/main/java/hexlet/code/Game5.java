package hexlet.code;

import java.util.Random;

class Game5 {
    private static final Random RANDOM = new Random();

    public static void progression() {
        // Random random = new Random();
        String text = "What number is missing in the progression?";
        String[][] qaArray = new String[3][2];

        for (int i = 0; i < qaArray.length; i++) {
            int step = RANDOM.nextInt(10) + 1;
            int length = RANDOM.nextInt(5, 11);
            int start = RandomNumber.getNumber();
            int missingPart = RANDOM.nextInt(length);

            String[] newArray = arrayCreation(length, step, start);
            String res = newArray[missingPart];
            newArray[missingPart] = "..";

            qaArray[i][0] = String.join(" ", newArray);
            qaArray[i][1] = res;
        }
        Engine.gameEngine(text, qaArray);
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
