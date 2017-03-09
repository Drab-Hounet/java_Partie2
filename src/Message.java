import java.util.Scanner;

public class Message {
	
	String content;
	private Scanner input = new Scanner(System.in);

	/**
	 * @return the content of the message
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * set the message with Scanner
	 */
	public void setContent() {
		System.out.println("Taper votre message : ");		
		this.content = input.nextLine();
	}
}
