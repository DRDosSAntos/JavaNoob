package labs3take2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Method2 {
    public static int spaces (String sentence){
        int sum = 0;
        String[] stncArray = new String[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {
            stncArray[i] = String.valueOf(sentence.charAt(i));
    }
//        System.out.println(Arrays.toString(stncArray));
        for (int i = 0; i < stncArray.length; i++){
            if(stncArray[i].equals(" ")){
                sum++;
            }
        }return sum + 1;
    }
}
