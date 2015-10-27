
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
public class Percentiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the ammount of numbers: ");
        int ammount = scan.nextInt();
        
        int[] numbers = new int[ammount];
        
        for (int i = 0; i < ammount; i++) {
            System.out.println("Please enter a number: ");
            numbers[i] = scan.nextInt();
        }
        Arrays.sort(numbers);
        
        System.out.println("What percentile are you looking for (in a decimal)?: ");
        float perc = scan.nextFloat();
        
        double found = ammount * perc;
        System.out.println("The number you are looking for is in spot: " + found);
        
        int produce = numbers[(int)found-1];

        
        System.out.println("The number at P" + perc * 100 + " is: " + produce);
        
    }
}
