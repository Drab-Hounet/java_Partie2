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
	
	public boolean getEachUser() {
		if(!this.listUsers.isEmpty()){
			for (int i = 0 ; i < this.listUsers.size(); i++){
				System.out.println((i+1) + ". " + listUsers.get(i).displayProfil());	
			}
			return true;
		}
		return false;
	}

	/**
	 * @param user to add in ListUsers
	 */
	public void addUser(User user) {
		this.listUsers.add(user);
	}
	
}
