
public class SpacedLogger implements Logger {
	
	//Question 6
	@Override
	public void log(String message) {
		StringBuilder newMessage = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			newMessage.append(message.charAt(i) + " ");
		}
		System.out.println(newMessage.toString());
	}
	
	//Question 8
	@Override
	public void error(String message) {
		StringBuilder errorMessage = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			errorMessage.append(message.charAt(i) + " ");
		}
		System.out.println("ERROR: " + errorMessage.toString());
	}
}
