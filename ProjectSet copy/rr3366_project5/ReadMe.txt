Rutvik Rau
rr3366

Word List
Created instance variables for file and scanner

NOTE FOR ALL INT N CASES:
If user adds a length which is too large, ie no words of the particular length, 
An empty file is created. As this would not be an error but an inefficiency of the file. Hence no words are possible. 

lenghtN
Each illegal argument error has own message, helps distinguish
what error has been caused
Throw a illegal argument message if n is negative
As long as file is not empty, if word has n letters, 
add word to the list

endsWith
For chars, enter only one character enclosed by ' ' not " "
Each illegal argument error has own message, helps distinguish
what error has been caused
Throw a illegal argument message if n is negative
Throw a illegal argument message if lastletter is
not a letter
As long as file is not empty, if word has n letters and if
lastletter is the same as last char add word to the list

containsLetter
Each illegal argument error has own message, helps distinguish 
what error has been caused
Throw a illegal argument message if n is negative
Throw a illegal argument message if index is negative
Throw a illegal argument message if included is
not a letter
Index counting starts from 0
Counting for length is from 1. For example, length of 3 has indexes: 0,1,2. Hence if index is 2 and length is 3, it is talking about the last letter in the string
As long as file is not empty, if word has n letters and if
char at index is the same as included add word to the list

multiLetter
Each illegal argument error has own message, helps distinguish
what error has been caused
Thorw a illegal argument message if m is negative
Thorw a illegal argument message if included is
not a letter
As long as file is not empty, go through each char of word
if there are m repetiions of included char, add word to list

WordTest
Hardcode to make it easier to test
Try block to encapsulate the code 
createss word list object 
creates writer file for each method run
runs each method and saves the output into a seperate file
catch blocks
If file hardcoded does not exist, filenotfound exception
If illegal argument error, print desired message 
Blanket case exception for any other errors