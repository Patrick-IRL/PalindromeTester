PalindromeTester
================

A Java application that reads a list of words from a text file and tests them, returning "true" for those that are Palindromes and "false" for those that are not. Words with non-alpha characters are disqualified, while upper and lower case are treated as being the same.

The application is designed to be exported as a .jar file. It can then be run via the command line, with the name of a text file as an argument. This allows the user to point the application to their own test files. However, if no argument is supplied, it will check in it's own current location for a default text file, which is supplied with the application(words.txt).

If the program is run from within Eclipse, with no arguments set in the launch parameters, the program will run using the text file included in the project folder and display results in the Eclipse console.

Example input (words.txt):

abba  
abc  
ab.ba  
axa  
ab ba  

Example output:

abba		true  
abc		  false  
ab.ba		false  
axa	  	true  
ab ba		false  
