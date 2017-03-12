import java.util.ArrayList;

public class User {
	
	protected String name = new String();
	protected String first_name = new String();
	protected int age;
	private int level_moderator = 0;
	protected ArrayList<Message> listMessage = new ArrayList<Message>(); 
	protected ArrayList<User> listFriends = new ArrayList<User>();
	
	public User(){
	}
	
	public User(String pName, String pFirst_name, int pAge){
		name = pName;
		first_name = pFirst_name;
		age = pAge;
	}
	//-------------------------------------------FRIENDS-------------------------------------------
	
	/**
	 * @return listFriends
	 */
	public ArrayList<User> getListFriends() {
		return listFriends;
	}

	public void displayFriends(){
		if(!this.listFriends.isEmpty()){
			for(User friend : this.listFriends){
				System.out.println(friend.displayProfil());
			}
		}else{
			System.out.println("-------> aucun ami");
		}
	}
	
	/**
	 * @param friend to add in listFriends
	 */
	public void addFriends (User friend) {
		this.listFriends.add(friend);		
	}
	
	//-------------------------------------------MESSAGE-------------------------------------------
	
	/**
	 * @return listMessage
	 */
	public boolean getListMessage() {
		if(!this.listMessage.isEmpty()){
			for(int i = 0 ; i < this.listMessage.size() ; i ++){
				System.out.println((i+1) + ". : " + this.listMessage.get(i).getContent());
			}
		}else{
			System.out.println("-------> aucun message");
			return false;
		}
		return true;
	}

	/**
	 * @param listMessage the message to set
	 */
	public void addMessage(Message message) {
		this.listMessage.add(message);
	}
	
	public void deleteMessage(){
		if(this.getListMessage()){
			try{
				this.listMessage.remove(Menu.menuDeleteMessage(this.listMessage, "Quel message souhaitez vous effacez ? ")-1);
				System.out.println("message supprimé");
			}catch(Exception e){
				System.out.println("Aucun message à supprimer");
			}
			
		}
	}

	//-------------------------------------------USER----------------------------------------------
	
	public void setProfil(){
		Menu.menuSetUser(this);
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
	
	/**
	 * @return first name
	 */
	public String getFirst_name(){
		return this.first_name;
	}
	
	/**
	 * @return age
	 */
	public int getAge(){
		return this.age;
	}

	public int getLevel_moderator() {
		return level_moderator;
	}
}
