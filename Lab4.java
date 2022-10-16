/**
 *   
 * Crystal Mahlmann
 * 300270674
 * 
 * October 12th - 16th, 2022.
 * 
 * Lab 4 - X's and O's
 * 
 * This program uses 'for loops' to output asterisks (*) in the shape of a large ‘X’ or ‘O’. 
 * Program asks the user whether they want to see an ‘X’ or an ‘O’, and what size it should be. 
 */
import java.util.Scanner;
public class Lab4 {
    public static void main (String[]args) {

        System.out.println("Welcome to X's and O's" + "\n" + "Please enter if you would like X or O:");
        Scanner input = new Scanner(System.in);
        String shape = input.next();
        System.out.println("Enter a number to choose a size: ");
        int size = input.nextInt();
        //Shape selection statment
        if (shape.equals("x") || shape.equals("X")) {
            System.out.println("You chose X in size " + size);
            //for loop, X pattern
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++)
                    if (i == j || size == (i + j + 1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                System.out.println();
            }
        }
        else if (shape.equals("o") || shape.equals("O")) {
            System.out.println("You chose O in size " + size);
            // for loop, O pattern
            for (int q = 0; q <= size; q++) {
                for (int r = 0; r <= size; r++) 
                    if (q == 0 || q == size || r == 0 || r == size) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                System.out.println();
            }
        }
    }
}

