
public interface Logger {
	//Question 1 and 2
	public void log(String message);
	public void error(String message);
}

//Coding Questions - Object-Oriented Programming:
// 1. Create an interface named 'Logger'.
// 2. Add two void methods to the Logger interface, each should take a String as an argument: Log and Error
// 3. Create two classes that implement the Logger interface: AsteriskLogger and SpacedLogger
// 4. The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String
// 5. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded
//		by the word “ERROR:”.
// 6. The SpacedLogger should add spaces between each character of the String argument passed into its methods.
// 7. If the log method received “Hello” as an argument, it should print H e l l o
// 8. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
// 9. Create a class named App that has a main method.
// 10. In this class instantiate an instance of each of your logger classes that implement the Logger interface.
// 11. Test both methods on both instances, passing in Strings of your choice.