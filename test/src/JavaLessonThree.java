public class JavaLessonThree {
	
	public static void main(String[] args)
	{

		int randomNumber = (int) (Math.random() * 50);
		
		if (randomNumber < 25)
		{
			System.out.println("The random number is less than 25");
		}
		
		else if (randomNumber > 40)
		{
			System.out.println("The random number is greater than 40");
		}
		
		else if (randomNumber == 19)
		{
			System.out.println("The random number is equal to 19");
		}
		
		else if (randomNumber != 40)
		{
			System.out.println("The random number is not equal to 40");
		}
		else 
		{
			System.out.println("Nothing Worked");
		}
		
			
		if (!(false))
		{
			System.out.println("\nTurned false into true");
		}
		
		if((true) && (true))
		{
			System.out.println("Both are true");
		}
		
		if ((true) || (true))
		{
			System.out.println("At least 1 is true");
		}
		
		if ((true) ^ (false))
		{
			System.out.println("1 is true and the other false");
		}
		
		//Conditional or ternary operator// 
		
		int valueOne = 1;
		int valueTwo = 2;
		
		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
		
		System.out.println(biggestValue);
		
		char theGrade = 'a';
		
		switch (theGrade)
		{
		case 'a':
		case 'A':
			System.out.println("Great Job Betta");
			break; 
		case 'b': 
		case 'B':
			System.out.println("Good Job");
			break;
		case 'c':
		case 'C':
			System.out.println("OKAY");
			break;
		case 'd':
		case 'D':
			System.out.println("Work harder");
			break;
		default:
			System.out.println("You failed");
			break; 
		}
		
	}
	
}