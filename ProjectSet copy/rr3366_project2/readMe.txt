I declared my variables as string, boolean and int
Initlaized them to the given values
Check method:
Created new varibales
* string -> card number
* boolean -> checker
* int -> errorCode. initialize = 0. 1-6 depending on which test failed


Used charAt to convert the string to a char

Used: https://www.javatpoint.com/java-char-to-string
To get converted char to string

used: https://www.geeksforgeeks.org/string-to-integer-in-java-parseint/#:~:
text=The%20method%20generally%20used%20to,as%20a%20signed%20decimal%20integer
To convert string to integer

created if statement for each step
If true the method returns true, if false method returns false
and the error code

Substring used for test 6
Printed else in order w the if to specify errorcode
Each step has its own method and check methods calls on them to ensure validity

isvalid returns checker
geterrorcode returns error code value


Test cases:
4807-6052-1766
4094-3460-2754

Fail 1: 5807-6052-1766
Fail 2: 4808-6052-1766
Fail 3: 4807-6052-0766
Fail 4: 4807-6152-1766
Fail 5: 4847-6052-1766
Fail 6: 4807-6056-1766
 
4808-605-1766