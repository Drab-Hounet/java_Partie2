import java.util.ArrayList;

public class Reseau_social {

	public static void main(String[] args) {
		
		boolean carryOnMenu = true;
		
		ArrayList<User> listUsers = new ArrayList<User>();
		
		User firstUser = new User();
		firstUser = Navigation.setUser(firstUser, listUsers);
		
		while(carryOnMenu){			
			switch(Navigation.displayMenu()){
				case 1:
					//display profile 
					
					System.out.println(firstUser.displayProfil());
					break;
					
				case 2:
					//write a message
					
					Message message = new Message();
					message.setContent();
					firstUser.addMessage(message);
					break;
				
				case 3:
					//display all messages
					
					if(!firstUser.getListMessage().isEmpty()){
						for(Message messageOne : firstUser.getListMessage()){
							System.out.println(messageOne.getContent());
						}
					}else{
						System.out.println("-------> aucun message");
					}
					
					break;
					
				case 4:
					//add a friend
					if(!listUsers.isEmpty() && (firstUser.listFriends.size() != listUsers.size())){
						Navigation.displayAndSaveUsers(listUsers, firstUser);
					}else{
						System.out.println("demande d'ami impossible");
					}
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
						newUser = Navigation.setUser(newUser,listUsers);						
						listUsers.add(newUser);
						
						carryOnSaveUser = Navigation.carryOn();
					}
					break;
					
				case 7:
					//display all users
					
					if(!listUsers.isEmpty()){
						for(User userOne : listUsers){
							System.out.println(userOne.displayProfil());
						}
					}else{
						System.out.println("-------> aucun utilisateur");
					}
					break;
					
				case 8:
					//modify an user
					
					Navigation.setUser(firstUser,listUsers);
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
