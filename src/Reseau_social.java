import java.util.ArrayList;

public class Reseau_social {

	public static void main(String[] args) {
		
		boolean carryOnMenu = true;
		
		ArrayList<User> listUsers = new ArrayList<User>();
		
		Navigation navigation = new Navigation();
		User firstUser = new User();
		firstUser = navigation.setUser(firstUser);
		
		while(carryOnMenu){			
			switch(navigation.displayMenu()){
				case 1:
					//display profile 
					System.out.println(firstUser.displayProfil());
					break;
				
				case 2:
					//write a message
					Message message = new Message();
					message.setMessage();
					firstUser.addMessage(message);
					break;
				
				case 3:
					//display all messages
					if(!firstUser.getListMessage().isEmpty()){
						for(int i = 0 ; i < firstUser.getListMessage().size() ; i++){
							System.out.println((firstUser.getListMessage().get(i)).getContent());
						}
					}else{
						System.out.println("-------> aucun message");
					}
					
					break;
					
				case 4:
					//add a friend
					navigation.displayListUsers(listUsers, firstUser);
					break;
					
				case 5:
					//display all your friends
					if(!firstUser.getListFriends().isEmpty()){
						for(int i = 0 ; i < firstUser.getListFriends().size() ; i++){
							System.out.println((firstUser.getListFriends().get(i)).displayProfil());
						}
					}else{
						System.out.println("-------> aucun ami");
					}
					
					break;
					
				case 6:
					//add an another user
					boolean carryOnSaveUser = true;

					while(carryOnSaveUser){
						
						User newUser = new User();
						newUser = navigation.setUser(newUser);						
						listUsers.add(newUser);
						
						carryOnSaveUser = navigation.carryOn();
					}
					break;
				case 7:
					//display all users
					if(!listUsers.isEmpty()){
						for(int i = 0 ; i < listUsers.size(); i++){
							System.out.println(listUsers.get(i).displayProfil());
						}
					}else{
						System.out.println("-------> aucun utilisateur");
					}
					
					break;
				case 10:
					//end of program
					carryOnMenu = false;
					System.out.println("Programme terminé !");
					break;
				default:
					System.out.println("Erreur !!");
			}	
		}
	}

}
