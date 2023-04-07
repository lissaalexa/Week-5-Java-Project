
public class App {

	public static void main(String[] args) {
		
		//Question 9 and 10
		Logger AsteriskLogger = new AsteriskLogger();
		Logger SpacedLogger = new SpacedLogger();
		
		//Question 11
		AsteriskLogger.log("Hello");
		AsteriskLogger.error("Hello");
		SpacedLogger.log("Hello");
		SpacedLogger.error("Hello");
	}

}
