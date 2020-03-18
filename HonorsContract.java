/*
 * This program will determine the possible Hamiltonian paths based on user inputs
 * 
 * import libraries
 * 
 * Start Class{
 * Start main{
 * Create new public integer 2D array with no exact size
 * Declare rows, columns, size, xCoord, yCoord, steps
 * Display prompt for user to enter for # of rows
 * Store input
 * Display prompt for user to enter for # of columns
 * Store input
 * Calculate the area of the board by multiplying rows and columns inputs
 * 
 * If the area is even and is bigger than 2
 * 		Display prompt for user to enter for the xcoordinate of the origin
 * 		Store input
 *		Display prompt for user to enter for the ycoordinate of the origin
 *		Store input
 *
 * 		Locate the origin on the array based on the indexes of the coordinates then set the value of that array to 0
 *		Set every single other open space of the array to -1 to indicate that the space has not been visited
 *
 *start recursion
 *	while the adjacent horizontal spot has not been visited
 *			move to the new spot
 *				the coordinate of the spot will be declared as false to represent that the spot cannot be visited again
 *				x coordinate + 1
 *				print out step on that specific coordinate with their respective indexes
 *				step + 1
 *					repeat
 *	 end while statement
 *
 *	while the adjacent vertical spot has not been visited
 *			move to the new spot
 *				the coordinate of the spot will be declared as false to represent that the spot cannot be visited again
 *					y coordinate + 1
 *					print out step on that specific coordinate
 *					step + 1
 *						repeat
 * 		end while statement
 * 
 * end if statement
 * 
 * else meaning that the board has an odd area or that the area is two
 * 		print out there is no available paths
 * end else statement
 * }end main
 * }end class
 */

import java.util.Scanner;
import java.util.Arrays;

public class HonorsContract
{
	// Declare an empty 2D integer array 
	public static int board[][];
	
    public static void main(String[] args)
    {
       
    	// Declare and initialize variables such as rows and columns
        int rows, columns, size, xCoord, yCoord, totalSteps, stepsTracker = 1;
        
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
        totalSteps = size - 1;
        
        // If the board has an even area
        if (size % 2 == 0 && size > 2)
        {            
            //Determine the x coordinate of the origin of the checker
            System.out.println("Please enter the x- coordinate of the origin: ");
            
            // Save the input into the variable xCoord
            xCoord = input.nextInt();
            xCoord = xCoord - 1;
            
            //Determine the y coordinate of the origin of the checker
            System.out.println("Please enter the y- coordinate of the origin: ");
            
            // Save the input into the variable xCoord
            yCoord = input.nextInt();
            yCoord = yCoord - 1;
            
            Array(rows, columns, xCoord, yCoord, totalSteps);
            
            // Call on Constructor
            // BoardArray board = new BoardArray(rows, columns, xCoord, yCoord, totalSteps);
        } 
              
        // If it's odd
        else
               // Print: there is no hamiltonian board.
                System.out.println("The checkerboard does not have a Hamiltonian cycle");
    } // End main 
    
    public static void Array (int rows, int columns,int xCoord,int yCoord,int totalSteps)      
    {
                board = new int[rows][columns];          
        		board[rows - xCoord - 1][yCoord] = 0;  	
        		
        		 for (int i = 0; i < rows; i++)
                 {
                 	for (int j = 0; j < columns; j++)
                 	{
                 		if (i == (rows - xCoord - 1) && j == yCoord)
                 			board[i][j] = 0; 
                 		
                 		else
                 			board[i][j] = -1; 
                 		
                 		System.out.print(board[i][j] + "  ");
                 	}
                 	System.out.println();
                 }// End assigning -1 to the array
        		 
                 
            } 
} // End class


/*
class BoardArray
{
		
		public static int board[][];
		
    	int arrxCoord, arryCoord, stepTracker = 1;
    	boolean beenThere = false;
    	
    	public BoardArray(int rows, int columns, int xCoord, int yCoord, int totSteps)
    	{
    		
    		this.arrxCoord = xCoord - 1;
    		this.arryCoord = yCoord - 1;
    		
    		board = new int[rows][columns];          
    		board[rows - arrxCoord - 1][arryCoord] = 0;  	
    		
    		 for (int i = 0; i < rows; i++)
             {
             	for (int j = 0; j < columns; j++)
             	{
             		if (i == (rows - arrxCoord - 1) && j == arryCoord)
             			board[i][j] = 0; 
             		
             		else
             			board[i][j] = -1; 
             		
             		System.out.print(board[i][j] + "  ");
             	}
             	System.out.println();
             }
    		 
    		 
    	} // End BoardArray
    	
    	public int getValue()
    	{
    		
    		return 0;
    	}
    	
    	public boolean beenThere(int xLocation, int yLocation)
    	{	
    		if (board[xLocation][yLocation] != -1)
    			return true;
    		else
    			return false;
    	}
    	
    }
    */

class RecursionPractice
{
	public static void main(String args[])
	{
		 printTriangle(3);
		 System.out.println(recursionFactorial(6));
		 System.out.println(sumCalculation(0));
	}
	
	 public static void printTriangle(int number)
	    {
	    	if (number < 1) { return; }
	    	
	    	printTriangle(number - 1);
	    	for (int i = 0; i < number; i++)
	    	{
	    		System.out.print("[]");
	    	}
	    	System.out.println();
	    	// printTriangle(number - 1);
	    }
	    
	    public static int recursionFactorial(int number)
	    {
	    	int factorial = 0;
	    	
	    	if (number == 1)
	    		return 1;
	    	else
	    	{
	    		factorial = number * recursionFactorial(number - 1);
	    		return factorial;
	    	}
	    }
	    
	    public static int sumCalculation(int number)
	    {
	    	int sum = 0;
	    	
	    	if (number > 0)
	    	{
	    		sum = number + sumCalculation(number - 1);
	    		return sum;
	    	}
	    		
	    	else
	    		return sum;
	    }
	    
}


