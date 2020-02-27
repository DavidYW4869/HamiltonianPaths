import java.util.Scanner;

public class HonorsContract
{
    public static void main(String[] args)
    {
        // Declare and initialize variables such as rows and columns
        
        int rows, columns, size, xCoord, yCoord, steps = 1;
        
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
            
            for (int i = xCoord; i <= rows; i++)
            {
            	for (int j = yCoord; j <= columns; j++)
            	{
            		if (i == xCoord && j == yCoord)
            		System.out.print("O" + " ");
            		else
            		{
            			System.out.print(steps + " ");
            			steps++;
            		}
            	}
            	System.out.println();
            }
            
            
            //Determine the path
                //Can only travel up or down
                //Cannot travel to a previous spot
        }
           
        
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



