
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author valet8115
 */
public class StandardDeviation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the ammount of numbers: ");
        int ammount = scan.nextInt();
        
        double[] numbers = new double[ammount];
        
        for (int i = 0; i < ammount; i++) {
            System.out.println("Please enter a number: ");
            numbers[i] = scan.nextDouble();
        }

        System.out.println("The mean is : ");

        double sum = 0;

        // Taking the average to numbers
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        double mean = sum / numbers.length;

        System.out.println(mean);

        double[] deviations = new double[ammount];

        // Taking the deviation of mean from each numbers
        for (int i = 0; i < deviations.length; i++) {
            deviations[i] = numbers[i] - mean;
        }

        System.out.println();
        double[] squares = new double[ammount];

        // getting the squares of deviations
        for (int i = 0; i < squares.length; i++) {
            squares[i] = deviations[i] * deviations[i];
        }

        sum = 0;

        // adding all the squares
        for (int i = 0; i < squares.length; i++) {
            sum = sum + squares[i];
        }

        // dividing the numbers by one less than total numbers
        double result = sum / (numbers.length - 1);


        double standardDeviation = Math.sqrt(result);

        // Taking square root of result gives the
        // standard deviation
        System.out.println("the Standard Deviation of " + ammount + " numbers is: ");
        System.out.printf("%4.2f", standardDeviation);

    }
}