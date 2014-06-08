/**
 * Author: Patrick Moorehouse 
 * Created: December 2013
 */

package com.patmoorehouse.palindrometester;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PalindromeTester {

	public static void main(String[] args) throws IOException {
		
		String inFileName;
		
		if(args.length == 1){
			inFileName = args[0];
		}else{
			inFileName = "words.txt";
		}
		
		File inputFile = new File(inFileName);
		BufferedReader in = new BufferedReader(new FileReader(inputFile));
		
		PalindromeTester pt = new PalindromeTester();
		String line;
		
		while ((line = in.readLine()) != null) {
			System.out.println(line + "\t\t" + pt.checkWord(line.toLowerCase()));
		}
		in.close();
	}
	
	public boolean checkWord(String str){
		int startIndex = 0;
		int endIndex = str.length() - 1;
		
		while(startIndex <= endIndex){
			if(!Character.isLetter(str.charAt(startIndex)) || (str.charAt(startIndex) != str.charAt(endIndex))){
				return false;
			}
			
			startIndex++;
			endIndex--;
		}
		
		return true;
	}
}
