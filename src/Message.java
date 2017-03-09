import java.util.Scanner;

public class Message {
	
	String content;
	private Scanner input = new Scanner(System.in);

	/**
	 * @return the message
	 */
	public String getContent() {
		return content;
	}

	public void setMessage() {
		System.out.println("Taper votre message : ");		
		this.content = input.nextLine();
	}
}
