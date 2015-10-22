
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
        System.out.println("How many numbers are there: ");
        float ammount = scan.nextInt();
        int [] nums = null;
        
        
        for (int i = 0; i < ammount; i++) {
            System.out.println("Please enter a number");
            int temp = scan.nextInt();
            nums[i] = temp;
        }
        System.out.println("Please enter the percentile you would like to find: ");
        float perc = scan.nextFloat();
        
        float at = ammount * perc;
        System.out.println("Your percentile is at spot: " + at);
        
    }
}
