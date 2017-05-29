/**
 * 
 */
package test;

/**
 * @author Japi
 *
 */
public class Video1 {

	/**
	 * @param args
	 */
	static String randonString = "String to print";
	static final double PINUM = 3.141529;
	
	public static void main(String[] args) {
		System.out.println(PINUM );
	
		int integerOne = 22; 
		int integerTwo = integerOne + 1; 
		
		System.out.println(integerTwo );
		// TODO Auto-generated method stub

		
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 2100000000;
		long bigLong = 9220000000000000000L;
		float bigFloat = 3.15F; 
		double bigDouble = 3.2881783949928738848340290; 
		
		System.out.println(Float.MAX_VALUE); 
		System.out.println(Double.MAX_VALUE); 
		
		boolean trueorFalse = true; 
		
		char randomChar = 68; 
		char anotherChar = 'S'; 
		System.out.println(randomChar); 
		System.out.println(anotherChar); 
		
		char escapedChars = '\f';
		char escapedChars1 = '\b';
		char escapedChars11 = '\n';
		char escapedChars2 = '\r';
		char escapedChars3 = '\t';
		char escapedChars4 = '\\';
		   
		System.out.println(escapedChars4);
		
		String randomString = "I'm Random String"; 
		String anotherString = "puff";
		
		String andAnotherString = randomString + ' ' + anotherString; 
		
		System.out.println(andAnotherString);
		
		String byteString = Byte.toString(bigByte); 
		String shortString = Short.toString(bigShort); 
		String intString = Integer.toString(bigInt); 
		String longString = Long.toString(bigLong); 
		String floatString = Float.toString(bigFloat); 
		//String booleanString = Boolean.toString(bigBoolean);// 
	
		System.out.println(byteString);
		System.out.println(shortString);
		System.out.println(intString);
		
		double aDoubleValue = 300000000000000.29924992449;
		int doubleToInt = (int) aDoubleValue; 
		
		System.out.println(doubleToInt);
		
		int stringToInt = Integer.parseInt(intString); 
		//parseShort, parseLong, parseByte, parseFloat, parseDoubel, parseBoolean// 
		
		
		System.out.println(stringToInt);
		
		
	}

}
