
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class WeighedMean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the ammount of numbers: ");
        double ammount = scan.nextDouble();
        int[] numbers = new int[(int)ammount];
        
        for (int i = 0; i < ammount; i++) {
            System.out.println("Please enter a number: ");
            numbers[i] = scan.nextInt();
        }
    }
}
