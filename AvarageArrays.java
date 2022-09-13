import java.util.Scanner;
public class AvarageArrays {
    public static void main(String[] args) {
        double[] numArray = { 2, 5, 9, 12, 1, 3 };
        double sum = 0.0;

        for (double num: numArray) {
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}
