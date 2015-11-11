import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * This class consists from methods which operates on 
 * string values which represent Roman number and convert
 * this value to the Decimal one
 * 
 * @author  Nick Babich
*/
public class RomanToNumbers {
	/*
	 * Processing a string which contains Roman number and  convert it to the decimal one
	 * @param romanNumber the input string value 
	 *  
	 */
	public static int convertRomanToNumbers(java.lang.String romanNumerals) {
	    int totalValue = 0;
	    int previousNumeralValue = 0;
	    int rigthInputString = 1;
	    /* Upper cases for input string if user types in lower cases*/
	    String romanNumeral = romanNumerals.toUpperCase();
	    
	    for (int element = romanNumeral.length() - 1; element >= 0 ; element--) {
	        char romanValue = romanNumeral.charAt(element);
            if (rigthInputString == 1)
            {
	        switch (romanValue) {
	            case 'M':
	            	totalValue = processValue(1000, previousNumeralValue, totalValue);
	                previousNumeralValue = 1000;
	                break;
	            case 'D':
	            	totalValue = processValue(500, previousNumeralValue, totalValue);
	            	previousNumeralValue = 500;
	                break;
	            case 'C':
	            	totalValue = processValue(100, previousNumeralValue, totalValue);
	            	previousNumeralValue = 100;
	                break;
	            case 'L':
	            	totalValue = processValue(50, previousNumeralValue, totalValue);
	            	previousNumeralValue = 50;
	                break;
	            case 'X':
	            	totalValue = processValue(10, previousNumeralValue, totalValue);
	            	previousNumeralValue = 10;
	                break;
	            case 'V':
	            	totalValue = processValue(5, previousNumeralValue, totalValue);
	            	previousNumeralValue = 5;
	                break;
	            case 'I':
	            	totalValue = processValue(1, previousNumeralValue, totalValue);
	            	previousNumeralValue = 1;
	                break;
	            default:
	                System.out.println("Invalid input format");
	                rigthInputString = 0;
	                break;
	        }
	    }
            else
             break;
	    }
	    if (rigthInputString == 1)
	    {
	      System.out.println("For this Roman Numeral arabic numeral is " + totalValue);
	      return totalValue;
	    }
	    return 0;
	    
	}
	
	/* 
	 * Processing a current number based on Additive and Subtractive Principles
	 * 
	 * @param currenNumeralValue the value which reflects current Roman numeric
	 * @param previousNumeralValue the value the value which reflects previous Roman numeric
	 * @param totalValue the value which reflects a difference to the previous part
	 * @return the current decimal value for processed chars
    */
	public static int processValue(int currenNumeralValue, int previousNumeralValue, int totalValue) {
	    if (previousNumeralValue > currenNumeralValue) {
	        return totalValue - currenNumeralValue;
	    } else {
	        return totalValue + currenNumeralValue;
	    }
	}

	public static void main(java.lang.String args[]) {
		
		try{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
			    System.out.println("Enter Roman Numeral to Convert or 'exit' to close application:");
		        String useInput = bufferRead.readLine();
				if ("exit".equalsIgnoreCase(useInput)) {
					System.out.println("So Long, and Thanks for All the Fish!");
					break;
				}
				convertRomanToNumbers(useInput);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
}
