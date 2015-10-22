
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class Mean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the ammount fo numbers");
        int ammount = scan.nextInt();
        int mean = 0;
        int total = 0;
        
        for (int i = 0; i < ammount; i++) {
            System.out.println("Please enter the number then hit enter");
            int add = scan.nextInt();
            total = total + add;
        }
        
        System.out.println("The total is: " + total);
        System.out.println("The mean is: " + total/ammount);
        
    }
}

//ask for ammount of numbers
//for the ammount of numbers
//input each number
//store that number
