public class JavaleassonTwo



import java.util.Scanner; 

{
	static Scanner userInput= new Scanner (System.in); 
	
	public static void  main (String[] args)
	{
		System.out.print("Your favroit number:  ");
		
		if (userInput.hasNextInt( ))
		{
			int numberEntered = userInput. nextInt(); 
			
			System.out.println("You entered this number "+numberEntered); 
			
			int numEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + "+" +numberEntered+"="+ numEnteredTimes2);  
	
			int numEnteredMinus2 = numberEntered-2;
			System.out.println(numberEntered + "-2 = " + numEnteredMinus2); 
				
			int numEnteredTimeSelf = numberEntered * numberEntered;
			System.out.println(numberEntered + "*" +numberEntered+"="+ numEnteredTimeSelf);  
	
			int numEnteredDivide2 = numberEntered / 2;
			System.out.println(numberEntered + "/ 2 = " + numEnteredDivide2); 
			
			//short hand addition// 
			 numberEntered += 2; 
			 numberEntered -= 2; 
			 
			 //decrement// 
			 numberEntered --; 
			 numberEntered ++; 
			 
			//Math library// 
			 
			 int numberABS = Math.abs(numberEntered); 
			 int WhichIsBigger = Math.max( 5,7 );
			 int WhichIsSmaller = Math.min( 5,7 );
			
			 System.out.println(WhichIsSmaller);
			 
			 
			 double numsqrt = Math.sqrt(5.33);   	
			 
			 int numCeiling = (int) Math.ceil(5.34); 
			  
			 int numfloor = (int) Math.floor(5.76);
			 
			 int numRound = (int) Math.round (5.76);
			 
			 //Randon number will be between .0 - .999999// 
			 int randomNumber = (int) (Math.random() *20 ); 
			 System.out.println("RandomNumber "+ randomNumber ); 
			 	
	
		 			 
		} else {
			
			System.out.println("Enter an Integer Next Time");
			
			
			
		}
		
	}



}