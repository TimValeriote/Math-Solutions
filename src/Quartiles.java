
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
        double found = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number: ");
            numbers[i] = scan.nextInt();
        }
        Arrays.sort(numbers);

        int tempQ2 = length % 2;
        if (tempQ2 == 0) {
            double q2 = length / 2;
            double low = q2;
            double high = low + 1;
            double total = numbers[(int) low - 1] + numbers[(int) high - 1];
            found = total / 2;
            System.out.println("Quartile 2 is: " + found);

        } else if (tempQ2 == 1) {

            int q2 = length / 2;
            System.out.println("Quartile 2 (or median) is: " + numbers[q2]);
        }
        
        double tempQ1 = found%2;
        if (tempQ1 == 0) {
            double q1 = found / 2;
            double low = q1;
            double high = low + 1;
            double total = numbers[(int) low - 1] + numbers[(int) high - 1];
            
            System.out.println("Quartile 1 is: " + found);

        } else if (tempQ1 == 1) {
            int q1 = length / 2;
            System.out.println("Quartile 1 is: " + numbers[q1]);
        }

    }
}
//Q2:
//take the array
//mod it by 2
//if there is no remainder
//we need to divided the array by 2
//make a value for the low number
//then make a value for the high number
//be sure to add 1 to each because an array starts with 0
//the add the 2 numbers and divide them by 2
//output the found number
//else
//we divide the length by 2
//and pick the spot int he array length divded by 2 is

//Q1:
//if the Q2 is not a decimal (no remainder)
//divide the length by 2 so you have the mean
//mod Q2
//if the mod Q2 is not a decimal
// then you have your Q1
//else