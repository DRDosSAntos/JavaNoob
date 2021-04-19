package labs3take2;

import javax.sql.rowset.Predicate;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Method {
    public static int largestValue(int input1, int input2, int input3) {
        return Math.max(Math.max(input1, input2), input3);
    }

    public static int averageValue(int input1, int input2, int input3) {
        return ((input1 + input2 + input3) / 3);
    }

    public static String middle(String word) {
        int position;
        int length;

        if (word.length() % 2 == 0) {
            position = word.length() / 2 - 1;
            length = 2;
        } else {
            position = word.length() / 2;
            length = 1;
        }
        return word.substring(position, position + length);
    }

    public static int vowel(String word) {
        String[] vow = {"e", "u", "i", "o", "a"};
        int sum = 0;

        String[] wrdArray = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wrdArray[i] = String.valueOf(word.charAt(i));
        }

        for (int x = 0; x < wrdArray.length; x++) {
            for (int y = 0 ; y < vow.length; y++)
            if (wrdArray[x].contains(vow[y])) {
                sum++;
            }

        }
        return sum;
    }
}

