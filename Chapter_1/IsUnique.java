/* 
1.1
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
*/
// Java program to illustrate String with unique 
// characters without using any data structure 
import java.util.*; 

class IsUnique { 
	boolean uniqueCharacters(String str) 
	{ 
		// Assuming string can have characters a-z 
		// this has 32 bits set to 0 
		int checker = 0; 

		for (int i = 0; i < str.length(); i++) { 
			int bitAtIndex = str.charAt(i) - 'a'; 

			// if that bit is already set in checker, 
			// return false 
			if ((checker & (1 << bitAtIndex)) > 0) 
				return false; 

			// otherwise update and continue by 
			// setting that bit in the checker 
			checker = checker | (1 << bitAtIndex); 
		} 

		// no duplicates encountered, return true 
		return true; 
	} 

	// Driver Code 
	public static void main(String args[]) 
	{ 
		IsUnique obj = new IsUnique(); 
		String input = "baLl"; 

		if (obj.uniqueCharacters(input)) 
			System.out.println("The String " + input 
							+ " has all unique characters"); 
		else
			System.out.println("The String " + input 
							+ " has duplicate characters"); 
	} 
} 
