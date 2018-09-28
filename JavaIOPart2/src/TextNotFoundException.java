
public class TextNotFoundException extends Exception {
	private String message = "Text Entered is not valid";
	
	public TextNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	public String getMessage() {
		return this.message;
	}
}
