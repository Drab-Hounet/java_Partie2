
/**
 * @author drab

 *
 */

public class NavGeneral {
	
	public void menu(GroupUser group){
			
		boolean carryOnMenu = true;
		
		User firstUser = new User();
		Menu.menuSetUser(firstUser);
		
		while(carryOnMenu){
								
			switch(Menu.menuGeneral()){
				case 1:
					//display profile 
					System.out.println(firstUser.displayProfil());
					break;
					
				case 2:
					//modify an user
					Menu.menuSetUser(firstUser);					
					break;
					
				case 3:
					//write a message
					Message message = new Message();
					message.setContent();
					firstUser.addMessage(message);
					break;
			
				case 4:
					//display all messages
					firstUser.getListMessage();
					break;
					
				case 5:
					//add a friend
					if(!group.getListUsers().isEmpty() && (firstUser.getListFriends().size() != group.getListUsers().size())){
						Menu.saveFriends(group.getListUsers(), firstUser);
					}else{
						System.out.println("demande d'ami impossible");
					}
					break;
					
				case 6:
					//display all your friends
					firstUser.displayFriends();
					break;
					
				case 7:
					//display all users
					if(!group.getListUsers().isEmpty()){
						for(User userOne : group.getListUsers()){
							System.out.println(userOne.displayProfil());
						}
					}else{
						System.out.println("-------> aucun utilisateur");
					}
					break;
				
				case 8:
					//delete a message from the user
					firstUser.deleteMessage();
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
