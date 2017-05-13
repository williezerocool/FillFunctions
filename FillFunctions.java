/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fillfunctions;

/**
 *
 * @author kendrabooker
 */
public class FillFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args )
	{
		// Fill in the function calls where appropriate.

		System.out.println("Watch as we demonstrate functions.");

		System.out.println();
		System.out.println("I'm going to get a random character from A-Z");
                randchar();
		

		System.out.println();
		System.out.println("Now let's count from -10 to 10");
		int begin, end;
		begin = -10;
		end = 10;
		counter(begin, end);
		System.out.println("How was that?");

		System.out.println();
		System.out.println("Now we take the absolute value of a number.");
		int x;
		x = -10;
		abso(x);
		

		System.out.println();
		System.out.println("That's all.  This program has been brought to you by:");
                credits();
	}


	public static void credits( )
	// No parameters.
	{
		// displays some boilerplate text saying who wrote this program, etc.
                String text = " ";
		
		text = "\n" + "programmed by Graham Mitchell\n" + "modified by Willie Suggs\n" + "This code is distributed under the terms of the standard\n" + "BSD license.  Do with it as you wish.";
		
		System.out.println(text);
	}




	public static void randchar()
	// No parameters.
	{
		// chooses a random character in the range "A" to "Z"
		
		int numval;
		char charval;

		// pick a random number from 0 to 25
		numval = (int)(Math.random()*26);
		// now add that offset to the value of the letter 'A'
		charval = (char) ('A' + numval);
                System.out.println("The character is: " + charval + "!");
		
	}




	public static void counter(int start, int stop )
	// Parameters are:
            //int start;
	    //int stop;
	{
		// counts from start to stop by ones
		for(int i = start; i < stop; i++){
                
                    System.out.println(i);
                }

		
	}




	public static void abso( int value )
	// Parameters are:
	//     int value;
	{
		// finds the absolute value of the parameter
		int absval;

		if ( value < 0 )
			absval = Math.abs(value);
		else
			absval = value;

		System.out.println("|"+ value + "| = " + absval);
	}

    
}
