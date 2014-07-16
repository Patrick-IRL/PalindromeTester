/**
 * Author: Patrick Moorehouse 
 * Created: December 2013
 * Class with a static method for checking if a word is a Palindrome.
 * Word is passed as a string argument to static method checkWord,
 * and a boolean value is returned.
 */

package com.patmoorehouse.palindrometester;

public class PalindromeCheck {
	
	public static boolean checkWord(String str){
		int leftIndex = 0;
		int rightIndex = str.length() - 1;
		
		while(leftIndex <= rightIndex){
			if(!Character.isLetter(str.charAt(leftIndex)) || (str.charAt(leftIndex) != str.charAt(rightIndex))){
				return false;
			}
			
			leftIndex++;
			rightIndex--;
		}
		
		return true;
	}
}
