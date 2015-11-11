
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author valet8115
 */
public class Correlation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the ammount of x values: ");
        int xammount = scan.nextInt();
        System.out.println("Please enter the ammount of y values: ");
        int yammount = scan.nextInt();
        double a = 0;
        double r = 0;
        double xy = 0;
        double xsq = 0;
        double ysq = 0;
        double xtotal = 0;
        double ytotal = 0;
        double[] xnumbers = new double[xammount];
        double[] ynumbers = new double[yammount];
        for (int i = 0; i < xnumbers.length; i++) {
            System.out.println("Please enter a x number: ");
            double temp = scan.nextDouble();
            xnumbers[i] = temp;
            xtotal = xtotal + temp; 
        }
        for (int i = 0; i < ynumbers.length; i++) {
            System.out.println("Please enter a y value");
            double temp = scan.nextDouble();
            ynumbers[i] = temp;
            ytotal = ytotal + temp; 
        }
        for (int i = 0; i < xnumbers.length; i++) {
            double temp = xnumbers[i];
            xsq = xsq + Math.pow(temp, 2);
        }
        for (int i = 0; i < ynumbers.length; i++) {
            double temp = ynumbers[i];
            ysq = ysq + Math.pow(temp, 2);
        }
        for (int i = 0; i < xnumbers.length; i++) {
            double temp1 = xnumbers[i];
            double temp2 = ynumbers[i];
            double temp3 = temp1 * temp2;
            xy = xy + temp3;
        }
        double top = (xammount * xy) - (xtotal * ytotal);
        double tempbottom = ((yammount * xsq) - (Math.pow(xtotal, 2)));
        double bottom = tempbottom * ((xammount * ysq) - (Math.pow(ytotal, 2)));
        double botfinal = Math.sqrt(bottom);
        double abot = (xammount * xsq) - (Math.pow(xtotal, 2));
        a = top / abot;
        r = top / botfinal;
        System.out.println("The a value is: " + a);
        System.out.println("The Correlation value is: " + r);
    }
}
