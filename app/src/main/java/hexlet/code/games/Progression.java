package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Progression {

    public static void game() {
        String text = "What number is missing in the progression?";
        String[][] qaArray = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int step = RandomUtils.getStepForArray();
            int length = RandomUtils.getLengthForArray();
            int start = RandomUtils.getNumber();
            int missingPart = RandomUtils.getNumber(length);

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
