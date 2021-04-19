package Udemy;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Ocptrain {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3);
        double sum = ls.stream().mapToInt(x -> x).sum();
        System.out.println(sum);
    }
}
