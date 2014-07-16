/**
 * Author: Patrick Moorehouse 
 * Created: December 2013
 * Class which reads a list of words from a file, uses the static method
 * checkWord(String str), from PalindromeCheck class, to test each
 * word to see if it is a palindrome or not.
 */

package com.patmoorehouse.palindrometester;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PalindromeCheck_Test {

	public static void main(String[] args) throws IOException {
		
		String inFileName;
		
		if(args.length == 1){
			inFileName = args[0];
		}else{
			inFileName = "words.txt";
		}
		
		File inputFile = new File(inFileName);
		BufferedReader in = new BufferedReader(new FileReader(inputFile));
		
		String line;
		
		while ((line = in.readLine()) != null) {
			System.out.println(line + "\t\t" + PalindromeCheck.checkWord(line.toLowerCase()));
		}
		in.close();
	}
}
