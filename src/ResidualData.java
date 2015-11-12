
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class ResidualData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double y = 0;
        double x = 0;
        double a = 0;
        double b = 0;
        double r = 0;
        System.out.println("Please enter the 'a' value: ");
        a = scan.nextDouble();
        System.out.println("Please enter the 'b' value: ");
        b = scan.nextDouble();
        System.out.println("Please enter the 'x' value we will be using ");
        x = scan.nextDouble();
        System.out.println("Please enter the 'y' value we will be using: ");
        y = scan.nextDouble();
        
        r = y - ((a * x) + b);
        
        System.out.println("The residual is: " + r);
    }
}
