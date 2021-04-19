package labs3take2;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class TypeSystem1 {
    public static void main(String[] args) throws InterruptedException {

//        List<Integer> array2 = new ArrayList<>();
//        Scanner stdin = new Scanner(System.in);
//
//        do {
//            System.out.println("Current list is " + array2);
//            System.out.println("Add more? (y/n)");
//            if (stdin.next().startsWith("y")) {
//                System.out.println("Enter : ");
//                array2.add(stdin.nextInt());
//            } else {
//                break;
//            }
//        } while (true);
//        stdin.close();
//        System.out.println("List is " + array2);
//
//        Thread.sleep(200);
//
//        int l = array2.toArray().length;
//        System.out.println("\n" + "Given the following array: " + array2);
//        double sum = array2.stream()
//                .mapToDouble(a -> a)
//                .sum();
//        double arrayAvg = sum / l;
//
//        array2.stream().mapToInt(b -> b).sorted();
//        System.out.println("\n" +"The average value of the given array is: " + arrayAvg);
//        System.out.println("\n" +"The following numbers are above the average value: \n");
//        for (int i = 0 ; i < l ; i++) {
//            if (array2.get(i) > arrayAvg) {
//                System.out.println(array2.get(i) + "");
//            }
//        }
//        int a = 74;
//        int b = 36;
//
//        int c = a + b;
//        System.out.println(c);
//        System.out.println("\n");
//        System.out.println("for this exercise you are going to write 3 numbers, and the program is going to calculate the average of these numbers");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please type the first number below: ");
//        double num1 = scanner.nextInt();
//        System.out.println("please type the second number below: ");
//        double num2 = scanner.nextInt();
//        System.out.println("please type the third number below: ");
//        double num3 = scanner.nextInt();
//
//        double numAvg = ((num1+num2+num3) / 3);
//        System.out.println(numAvg);

//        for (int i = 0 ; i < 10 ; i++) {
//            Thread.sleep(250);
//            System.out.println(num1 + "x" + (i + 1) + "=" + (num1 * (i + 1)));
//        }
//        System.out.println("\n");
//
//        int a, b, temp;
//        a = 15;
//        b = 27;
//
//        System.out.println("Before swapping : a, b = " + a + ", " + b);
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After swapping : a, b = " + a + ", " + b);
//
//        System.out.println(System.getProperty("java.version"));
//        System.out.println(System.getProperty("java.runtime.version"));
//        System.out.println(System.getProperty("java.vendor"));
//        System.out.println(System.getProperty("java.class.path"));

//        System.out.println("The following program will check if the next four digits you input are equal or not");
//        System.out.println("Please input the first number below:");
//        Scanner scannerIn = new Scanner(System.in);
//        int num1 = scannerIn.nextInt();
//        System.out.println("Please input the second number below:");
//        int num2 = scannerIn.nextInt();
//        System.out.println("Please input the third number below:");
//        int num3 = scannerIn.nextInt();
//        System.out.println("Please input the fourth number below:");
//        int num4 = scannerIn.nextInt();
//
//        if(num1 == num2 && num1 == num3 && num1 == num4){
//            System.out.println("Numbers ARE equal!");
//
//        }else{
//            System.out.println("Numbers ARE NOT equal!");
//        }
//        System.out.println("this program will check if the 2 numbers you input are between 0 and 1");
//        Scanner scannerIn = new Scanner(System.in);
//        System.out.println("please input the first number");
//        String num1 = scannerIn.nextLine();
//        System.out.println("please input the second number");
//        String num2 =scannerIn.nextLine();
//
//        double dubNum1 = Double.parseDouble(num1);
//        double dubNum2 = Double.parseDouble(num1);
//
//        if ((dubNum1 >=0 && dubNum1 <=1) && (dubNum2 >=0 && dubNum2 <=1)){
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//        boolean[][] booleans = {{true, false, true}, {false, true, false}};
//
//        int rows_length = booleans.length;
//        int columns_length = booleans[0].length;
//
//        for (int i = 0; i < rows_length; i++) {
//            for (int j = 0; j < columns_length; j++) {
//
//                if (booleans[i][j]) {
//                    System.out.print(" t ");
//                } else {
//                    System.out.print(" f ");
//                }
//            }
//            System.out.println();
//        }
//        int[] array = {3, 90, 67,1, 34, 105,89, 200};
//        int l = array.length;
//        System.out.println("given the array: " + Arrays.toString(array));
//        Scanner scannerIn = new Scanner(System.in);
//        System.out.println("please input an integer value for 'k' below, the program will then select k-amount of highest numbers form the array.: ");
//        int k = scannerIn.nextInt();
//
//        Arrays.sort(array);
//        for (int i = (l-1) ; k != 0 ; k-- , i--){
//            System.out.println(array[i] + "");
//        }

//        int[] intArray = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
//        Arrays.sort(intArray);
//        System.out.println(Arrays.toString(intArray));

//        int[] intArray2 = {0, 3, 4, 0, 1, 2, 5, 0};
//        String[] stringArray = new String[intArray2.length];
//
//        for (int i = 0; i < intArray2.length; i++) {
//            stringArray[i] = String.valueOf(intArray2[i]);
//        }
//
////        System.out.println(Arrays.toString(stringArray));
//
//        String[] arrayResult = Arrays.stream(stringArray)
//                .sorted((s1, s2) -> "0".equals(s1) ? 1 : "0".equals(s2) ? -1 : 0)
//                .toArray(String[]::new);
//
//
//        System.out.println(Arrays.toString(arrayResult));
//
//        System.out.println("This program converts minutes into a number of days and years");
//        System.out.println("please input a number of minutes");
//        Scanner scannerIn = new Scanner(System.in);
//        String minsInput = scannerIn.nextLine();
//        float intMinsInput = Float.parseFloat(minsInput);
//        float year = intMinsInput / 525600;
//        float day = intMinsInput / 1440;
//        float remainingMins = day % 525600;
//
//        DecimalFormat year2Dec = new DecimalFormat("#.00");
//        DecimalFormat day2Dec = new DecimalFormat("#.00");
//        DecimalFormat remaining2Dec = new DecimalFormat("#.00");
//
//        if(intMinsInput < 525600){
//            System.out.println(intMinsInput + " minutes is equal to approximately: " + day2Dec.format(day) + " days.");
//        } else {System.out.println(intMinsInput + " minutes is equal to approximately: " + year2Dec.format(year) + " years, and " + remaining2Dec.format(remainingMins) + " days.");}
//
//
//        System.out.println("please input a number below: ");
//        Scanner scannerIn = new Scanner(System.in);
//        String num1 = scannerIn.nextLine();
//        int input = Integer.parseInt(num1);
//        if (input < 0) {
//            System.out.println("number is negative");
//        }
//
//           else if (input > 0) {
//                System.out.println("number is positive");
//            } else {
//                System.out.println("number is neither negative nor positive");
//            }
        Scanner scannerIn = new Scanner(System.in);
//        System.out.println("please input the 1st number");
//        String num1 = scannerIn.nextLine();
//        System.out.println("please input the 2nd number");
//        String num2 = scannerIn.nextLine();
//        System.out.println("please input the 3rd number");
//        String num3 = scannerIn.nextLine();
//
//        int input1 = Integer.parseInt(num1);
//        int input2 = Integer.parseInt(num2);
//        int input3 = Integer.parseInt(num3);
//
//        System.out.println("The largest value is: " + Method.largestValue(input1, input2, input3));
//        System.out.println("The average value is: " + Method.averageValue(input1, input2, input3));

//        System.out.println("please type a word");
//        String word = scannerIn.nextLine();
//
//        System.out.println("The middle character is: " + Method.middle(word));
//        System.out.println("The amount of vowels in this word are: " + Method.vowel(word));
//
//        System.out.println("please type a sentence");
//        String sentence = scannerIn.nextLine();
//        System.out.println(Method2.spaces(sentence));
//        System.out.println("The amount of words in this sentence is: " + Method2.spaces(sentence));

        System.out.println("please type an integer:");
        Scanner intScanner = new Scanner(System.in);
        int intInput = intScanner.nextInt();
        System.out.println("the sum of the numbers in this integer is: " + Method3.intCounter(intInput));


    }
}


