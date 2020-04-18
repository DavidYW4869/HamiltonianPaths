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
 * store the value to variable size
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
 *			if (noValidMoves && stepsTracker == totalSteps && adjacentCellZero)
 *				printResults();
 *			else
 *				for
 *					If isValidMove
 *						Move
 *						Cell = stepsTracker
 *						xCurrent = x after move
 *						yCurrent = y after move
 *					else
 *					Undo Movement
 *				end for loop
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
	
	public static final int[] xMoves = {1, -1, 1, -1};
	public static final int[] yMoves = {1, -1, -1, 1};
	

    public static int rows, columns, size, xCoord, yCoord, xIndex, yIndex, totalSteps, stepsTracker = 0;
    public static int xCurrent, yCurrent;
    
    public static int xTest, yTest;
    
    public static int counter = 0;

    
	public static void main(String[] args)
    {
       
    	// Declare and initialize variables such as rows and columns
        // int rows, columns, size, xCoord, yCoord, totalSteps, stepsTracker = 1;
        
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
        totalSteps = size;
        
        // If the board has an even area
        if (size % 2 == 0 && size > 2)
        {            
            //Determine the x coordinate of the origin of the checker
            System.out.println("Please enter the x- coordinate of the origin: ");
            
            // Save the input into the variable xCoord
            xCoord = input.nextInt();
            
            // Covert to array index
            xIndex = xCoord - 1;
            
            //Determine the y coordinate of the origin of the checker
            System.out.println("Please enter the y- coordinate of the origin: ");
            
            // Save the input into the variable yCoord
            yCoord = input.nextInt();
            
            // Covert to array index
            yIndex = yCoord - 1;
            
            board = new int[rows][columns];          
    		//board[columns - yIndex - 1][xIndex] = 0;  	
    		
    		 for (int i = 0; i < rows; i++)
             {
             	for (int j = 0; j < columns; j++)
             	{
             		//if (i == (columns - yIndex - 1) && j == xIndex)
             			//board[i][j] = 0; 
             		
             		//if
             			board[i][j] = -1; 
             		
             		//System.out.print(board[i][j] + "  ");
             	}
             	//System.out.println();
             }// End assigning -1 to the array

    		//if (rows == columns)
    			move(rows - yIndex - 1, xIndex);
    		
    		
    		printResults();
    		 
        }
              
        // If it's odd
        else
               // Print: there is no hamiltonian board.
                System.out.println("The checkerboard does not have a Hamiltonian cycle");
    } // End main 
	
	/*
	
	// Debug
	
	public static void move(int xNext, int yNext)
	{
		if (stepsTracker == totalSteps  && isNextCellOrigin(xNext, yNext))
		{
			//foundAnswer = true;
			printResults();
		}
				
		else 
		{
			//printResults();
			
			if (isValidMove(xNext + 1, yNext) && board[xNext + 1][yNext] == -1)
			{
				board[xNext + 1][yNext] = stepsTracker;
				stepsTracker++;
				move(xNext + 1,yNext);
			}
						
			else if (isValidMove(xNext, yNext + 1) && board[xNext][yNext + 1] == -1)
			{
				board[xNext][yNext + 1] = stepsTracker;
				stepsTracker++;
				move(xNext,yNext + 1);
			}
			
			else if (isValidMove(xNext, yNext - 1) && board[xNext][yNext - 1] == -1)
			{
				board[xNext][yNext - 1] = stepsTracker;
				stepsTracker++;
				move(xNext,yNext - 1);
			}
			
			else if (isValidMove(xNext - 1, yNext) && board[xNext - 1][yNext] == -1)
			{
				board[xNext - 1][yNext] = stepsTracker;
				stepsTracker++;
				move(xNext - 1, yNext);
			}
			
			printResults();
			
		}
	}
	
	*/
	
	public static void solve(int xStart, int yStart)
	{
		/*
		if(move(xStart, yStart))
		{
			printResults();
			board[xStart][yStart] = 0;
		}
		*/
		//move(xStart, yStart);
	}
	
	public static boolean move(int xNext, int yNext)
	{		
		xTest = xNext;
		yTest = yNext;
		counter++;
		
		printResults();
		
		System.out.println();
		
		// If the next move is not available, return false;
		if (!isValidMove(xNext, yNext))
		{
			return false;
		}
		
		if (stepsTracker == totalSteps)
		{
			System.out.println("*");
		}
		
		board[xNext][yNext] = stepsTracker;
		stepsTracker++;		
		
		if (stepsTracker == totalSteps && isNextCellOrigin(xNext, yNext))
		// Terminal condition 
		//if (stepsTracker == totalSteps)
		{
			return true;
		}
		
			// Move bottom
			if (move(xNext + 1, yNext))
			{
				return true;
			}
			
			// Move right
			if (move(xNext, yNext + 1))
			{
				return true;
			}
			
			// Move top
			if (move(xNext - 1, yNext))
			{
				return true;
			}
			
			//Move left
			if (move(xNext, yNext - 1))
			{
				return true;
			}

			//if(!isNextCellOrigin(xNext, yNext))
				//return false;
			
		// If none of the movement return true then back track and recount the steps.
		board[xNext][yNext] = -1;
		stepsTracker--;
		
		
		// Answer not found
		return false;
	}
	
	/* 
	
	Debug
	
	public static boolean move(int xNext, int yNext)
	{
		if (stepsTracker == totalSteps  && isNextCellOrigin(xNext, yNext))
		{	
			return true;
		}
				
		//printResults();
		if (isValidMove(xNext, yNext))
		{
			board[xNext][yNext] = stepsTracker;
			stepsTracker++;		
						
			if (move(xNext + 1, yNext))
			{
				printResults();
				return true;
			}
			else if (move(xNext, yNext + 1))
			{
				printResults();
				return true;
			}
			
			else if (move(xNext - 1, yNext))
			{
				printResults();
				return true;
			}
			
			else if (move(xNext, yNext - 1))
			{
				printResults();
				return true;
			}
		
		board[xNext][yNext] = -1;
		printResults();
		return false;
		
		}
		
		return false;
	}
	
	*/
		
		/*
		
		// Debug 
		
			int i = 0, j = 0;
			
			while(foundAnswer == false)
			{
				//printResults();
				xNext = xNext + xMoves[i];
				while(foundAnswer == false)
				{
						yNext = yNext + yMoves[j];
						if (isValidMove(xNext, yNext) && board[xNext][yNext] == -1)
						{
							//printResults();
							board[xNext][yNext] = stepsTracker;
							stepsTracker++;
							move(xNext, yNext);
							//board[xNext][yNext] = -1;
							//printResults();
						}
						
						else
							//board[xNext][yNext] = -1;
						if(j == yMoves.length - 1)
							j = 0;
						else
							j++;						
				}
				if(i == xMoves.length - 1)
					i = 0;
				else
					i++;
			}
			
		}
	*/
	
	public static boolean isValidMove(int xTracker, int yTracker)
	{
		if (xTracker < 0 || xTracker >= rows || yTracker < 0 || yTracker >= columns)
			return false;

		else if(board[xTracker][yTracker] != -1)
			return false;
		
		else 
			return true;
	}	

	/*
	public static boolean isNextCellOrigin(int xTracker, int yTracker)
	{
	
		// Checks right cell
		if (yTracker < columns - 1)
		{
			if (board[xTracker][yTracker + 1] == 0)
				return true;
			else 
				return false;
		}
		
		// checks left cell
		else if (yTracker > 0)
		{
			if (board[xTracker][yTracker - 1] == 0)
				return true;
			else 
				return false;
		}
		
		// checks up cell
		else if (xTracker > 0)
		{
			if (board[xTracker - 1][yTracker] == 0)
				return true;
			else 
				return false;
		}
		
		// checks bottom cell
		else if (xTracker < rows - 1)
		{
			if (board[xTracker + 1][yTracker] == 0)
				return true;
			else 
				return false;
		}
		
		else
			return false;
		
	}
	*/
	
	public static boolean isNextCellOrigin(int xTracker, int yTracker)
	{
		if (xTracker > 0 && xTracker < rows - 1)
		{	
			if (board[xTracker - 1][yTracker] == 0)
				return true;
			if (board[xTracker + 1][yTracker] == 0)
				return true;
			else 
				return false;
		}
		
		if(yTracker > 0 && yTracker < columns - 1)
		{
			if(board[xTracker][yTracker + 1] == 0)
				return true;
			if (board[xTracker][yTracker - 1] == 0)
				return true;
			else 
				return false;
		}
		
		if (xTracker == 0 && yTracker > 0)
		{	
			if (board[xTracker + 1][yTracker] == 0)
				return true;
			if (board[xTracker][yTracker - 1] == 0)
				return true;
			else 
				return false;
		}
		
		if (xTracker > 0 && yTracker == 0)
		{	
			if (board[xTracker][yTracker + 1] == 0)
				return true;
			if (board[xTracker - 1][yTracker] == 0)
				return true;
			else 
				return false;
		}
		
		if (xTracker == 0 && yTracker == 0)
		{	
			if (board[xTracker + 1][yTracker] == 0)
				return true;
			if (board[xTracker][yTracker + 1] == 0)
				return true;
			else 
				return false;
		}

		else 
			return false;
	}
	
	/*
	 
	// Debug
	  
	public static void moveRight(int xTracker, int yTracker)
	{
 	
    	board[xTracker][yTracker] = stepsTracker;
    	stepsTracker++;
    	move(xTracker, yTracker);
	}
	
	public static void moveLeft(int xTracker, int yTracker)
	{
    	board[xTracker][yTracker] = stepsTracker;
    	stepsTracker++;
    	move(xTracker, yTracker);
	}	
	
	public static void moveUp(int xTracker, int yTracker)
	{
		board[xTracker][yTracker] = stepsTracker;
		stepsTracker++;
		move(xTracker, yTracker);
	}	
	
	public static void moveDown (int xTracker, int yTracker)
	{
		board[xTracker][yTracker] = stepsTracker;
    	stepsTracker++;
    	move(xTracker, yTracker);
	}
    */
	
	public static void printResults()
	{
		for (int i = 0; i < rows; i++)
        {
        	for (int j = 0; j < columns; j++)
        	{
        		System.out.print(board[i][j] + "\t");
        	}
        	System.out.println();
        }
        System.out.println("\n" + xTest + " " + yTest);
		System.out.println("\nRecursed: " + counter);
	
	}
} // End class












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


