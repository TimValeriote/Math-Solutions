
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author valet8115
 */
public class ZScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the standard devation of numbers: ");
        double sd = scan.nextDouble();
        System.out.println("Please enter the mean of the data: ");
        double mean = scan.nextDouble();
        System.out.println("Please enter the score/input of the data: ");
        double xbar = scan.nextDouble();
        double found = 0;

        double temp = xbar - mean;
        found = temp / sd;

        System.out.println("The Z-Score is: " + found);
    }
}
