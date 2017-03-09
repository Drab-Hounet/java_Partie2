import java.util.ArrayList;

public class User {
	String name = new String();
	String first_name = new String();
	int age;
	ArrayList<Message> listMessage = new ArrayList<Message>(); 
	ArrayList<User> listFriends = new ArrayList<User>();
	
	/**
	 * @return listFriends
	 */
	public ArrayList<User> getListFriends() {
		return listFriends;
	}

	/**
	 * @param friend to add in listFriends
	 */
	public void addFriends (User friend) {
		this.listFriends.add(friend);
	}
	
	/**
	 * @return listMessage
	 */
	public ArrayList<Message> getListMessage() {
		return listMessage;
	}

	/**
	 * @param listMessage the message to set
	 */
	public void addMessage(Message message) {
		this.listMessage.add(message);
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return all attributes toString
	 */
	public String displayProfil(){
		return this.name + " " + this.first_name + " age : " + this.age + " ans";
	}
	
	/**
	 * @return name
	 */
	public String getName(){
		return this.name;
	}
	
}
