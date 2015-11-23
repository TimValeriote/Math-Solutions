
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class WeightedMean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the ammount of numbers: ");
        double ammount = scan.nextDouble();
        int[] numbers = new int[(int)ammount];
        int[] weighting = new int[(int)ammount];
        int wtotal = 0;
        int total = 0;
        
        for (int i = 0; i < ammount; i++) {
            System.out.println("Please enter a weighting factor number: ");
            weighting[i] = scan.nextInt();
        }
        for (int i = 0; i < ammount; i++) {
            System.out.println("Please enter a number: ");
            numbers[i] = scan.nextInt();
        }
        
        int top = wtotal * total;
        int bot = wtotal;
        
        double end = top / bot;
        
        System.out.println("The weighted mean is: " + end);
        
    }
}
