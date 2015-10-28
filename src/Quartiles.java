
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author valet8115
 */
public class Quartiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the ammount of numbers: ");
        int ammount = scan.nextInt();
        int[] numbers = new int[ammount];
        int length = numbers.length;
        double foundQ2 = 0;
        double foundQ1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number: ");
            numbers[i] = scan.nextInt();
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        double tempq1 = numbers.length * 0.25;
        double tempq2 = numbers.length * 0.50;
        double tempq3 = numbers.length * 0.75;

        double remainderq1 = tempq1 - (int) tempq1;
        double remainderq2 = tempq2 - (int) tempq2;
        double remainderq3 = tempq3 - (int) tempq3;

        if (remainderq1 != 0) {
            double high = Math.ceil(tempq1);
            double low = Math.floor(tempq1);
            double q1 = (high + low) / 2;
            System.out.println("Quartile 1 is: " + numbers[(int) q1]);
        } else {
            System.out.println("Quartile 1 is: " + numbers[(int) tempq1]);
        }

        if (remainderq2 != 0) {
            double high = Math.ceil(tempq2);
            double low = Math.floor(tempq2);
            double q2 = (high + low) / 2;
            System.out.println("Quartile 2 (or median) is: " + numbers[(int) q2]);

        } else {
            System.out.println("Quartile 2 (or median) is: " + numbers[(int) tempq2]);
        }

        if (remainderq3 != 0) {
            double high = Math.ceil(tempq3);
            double low = Math.floor(tempq3);
            double q3 = (high + low) / 2;
            System.out.println("Quartile 3 is: " + numbers[(int) q3]);

        } else {
            System.out.println("Quartile 3 is: " + numbers[(int) tempq3]);
        }

    }
}
