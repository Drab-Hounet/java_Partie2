import java.util.ArrayList;

/**
 * @author drab
 *
 */
public class GroupUser {
	
	private ArrayList<User> listUsers = new ArrayList<User>();

	public ArrayList<User> getListUsers(){
		return this.listUsers;
	}
	
	public void getEachUser() {
		if(!this.listUsers.isEmpty()){
			for (User userOne : this.listUsers){
				System.out.println(userOne.displayProfil());
			}
		}
	}

	/**
	 * @param user to add in ListUsers
	 */
	public void addUser(User user) {
		this.listUsers.add(user);
	}
	
}
