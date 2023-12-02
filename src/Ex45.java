import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.max;

public class Ex45 {
    public static void main(String[] args) {
        List<Double> executionTimes = Arrays.asList(12.30, 12.45, 12.35, 12.54,
                12.53, 12.45, 12.61, 12.62, 12.73, 12.91, 12.90, 12.72, 12.85, 12.90, 12.70, 12.58, 12.61,
                12.67, 12.63, 12.61, 12.74, 12.84, 12.99, 13.10, 13.21, 13.39, 13.23, 13.09, 13.15, 13.00,
                12.91, 12.85, 12.89, 13.00, 13.03, 13.16, 13.25, 13.35, 13.36, 13.28, 13.42, 13.49, 13.36,
                13.32, 13.20, 13.23, 13.20, 13.02, 12.91, 12.74, 12.81, 12.63, 12.79, 12.65, 12.59, 12.77,
                12.77, 12.89, 12.76, 12.76, 12.91, 12.90, 12.86, 12.89, 12.83, 12.67, 12.69, 12.65, 12.73,
                12.87);


        double sumExecutionTimes = 0;
        for (double executionTimes1 : executionTimes) {
            sumExecutionTimes = sumExecutionTimes + executionTimes1;
        }

        double ave = sumExecutionTimes / executionTimes.size();
        System.out.println("Átlag: " + ave);

        System.out.println(String.format("%.3f", ave));


        System.out.println(Collections.max(executionTimes));
        System.out.println(Collections.min(executionTimes));

        double largest = executionTimes.get(0);

        for (double num : executionTimes) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println(largest);


        double min = executionTimes.get(0);

        for (double num : executionTimes) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);


    }
}
