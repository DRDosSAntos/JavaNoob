package labs5;

public class Calculator {
    public static int greatest(int a, int b) {
        return Math.max(a, b);
    }

    public static String greatest(String a, String b) {

        if (a.length() < b.length()) {
            return b;
        }

        return a;

    }

    public static int greatest(int... values) {

        int max = 0;
        for (int value : values) {

            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static int factorial(int n, int sum) {

        if (n == 1) return sum;
        if (n < 0) return -1;
        sum = sum * n;

        return factorial(n - 1, sum);

    }

}

