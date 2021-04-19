package labs3take2;

import java.util.Arrays;

public class Method3 {
    public static int intCounter(int intInput) {
        int sum = 0;

        String intString = String.valueOf(intInput);

        int[] intArray = new int[intString.length()];


        for (int i = 0; i < intString.length(); i++) {
            intArray[i] = intString.charAt(i) - '0';
        }

        for (int x = 0; x < intArray.length; x++) {
            sum += intArray[x];
        }
        return sum;
    }
}

