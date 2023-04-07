
public class AsteriskLogger implements Logger {
	
	//Question 4
	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
	}
	
	//Question 5
	@Override
	public void error(String message) {
		String border = "*************";
		for (int i = 0; i < message.length(); i++) {
			border += "*";
		}
		System.out.println(border);
		System.out.println("***Error: " + message + "***");
		System.out.println(border);
	}
}
