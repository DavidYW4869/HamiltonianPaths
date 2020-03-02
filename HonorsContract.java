/*
 * Declare rows, columns, size, xCoord, yCoord, steps
 * Ask User for # of rows
 * Ask User for # of columns
 * Establish new 2D array
 * If the board is even
 * 		find the x coordinate and save under xCoord
 * 		find the y coordinate and save under yCoord
 * 		Set the origin on the array based on the indexes of the coordinates
 *		
 *		while the adjacent horizontal spot has not been visited
 *			move to the new spot
 *				the coordinate of the spot will be declared as false to represent that the spot cannot be visited again
 *				x coordinate + 1
 *				print out step on that specific coordinate with their respective indexes
 *				step + 1
 *					repeat
 *		end if staatement 
 *
 *		while the adjacent vertical spot has not been visited
 *			move to the new spot
 *				the coordinate of the spot will be declared as false to represent that the spot cannot be visited again
 *					y coordinate + 1
 *					print out step on that specific coordinate
 *					step + 1
 *						repeat
 * 		end while statement
 * end while statement
 * 
 * else meaning that the board has an odd number of spacces
 * 		print out there is no avaliable paths
 * end else statement
 * end main
 * end class * 
 */

import java.util.Scanner;

public class HonorsContract
{
    public static void main(String[] args)
    {
        // Declare and initialize variables such as rows and columns
        
        int rows, columns, size, xCoord, yCoord, steps = 1;
        boolean beenThere = false;
        
        // Declare Scanner object
        Scanner input = new Scanner(System.in);
        
        // Ask user to type in a integer that represents number of rows
        System.out.println("Please enter the number of rows: ");
        
        // Save the input into the variable rows
        rows = input.nextInt();
        
        // Ask user to type in a integer that represents number of columns
        System.out.println("Please enter the number of columns: ");
        
        // Save the input into the variable columns
        columns = input.nextInt();
        
        // Determine if the product of rows and columns is even or odd
        size = rows * columns;
        
        // Establish arrays
        int[][] board = new int[rows][columns];
        
        // If itÅfs even
        if (size % 2 == 0)
        {
            // Print out the board
            
            //Determine the x coordinate of the origin of the checker
            System.out.println("Please enter the x- coordinate of the origin: ");
            
            // Save the input into the variable xCoord
            xCoord = input.nextInt();
            
            //Determine the y coordinate of the origin of the checker
            System.out.println("Please enter the y- coordinate of the origin: ");
            
            // Save the input into the variable xCoord
            yCoord = input.nextInt();
            
            // Assign the coordinate to the array
            board[xCoord - 1][yCoord - 1] = 0;
            
            //Determine the path
            
            /*while (xCoord <= rows)
            {
            	while (yCoord <= columns)
            	{
            		if ((xCoord != rows) &&  !beenThere)
            		{
            			
            		}
            	}
            }
            */
        }
                //Can only travel up or down
                //Cannot travel to a previous spot            
           
        
        // If itÅfs odd
        else
           //Ask the user if they allow the checker to move off the board
                //If the user says yes
                    //Determine the starting point
                    //Draw out the board

               //If the user says no
               //Print: there is no hamiltonian board.
                System.out.println("The checkerboard does not have a Hamiltonian cycle");

    }

}



