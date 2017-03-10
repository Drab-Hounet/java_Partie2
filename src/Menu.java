import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author drab
 *
 */

public final class Menu {
	
	private static Scanner input = new Scanner(System.in); 
	
	public static int menuGeneral(){
		//display the general menu		
		int menuItem;
		System.out.println("Choisissez :");
		System.out.println("1. Afficher votre profil");
		System.out.println("2. Modifier votre profil");
		System.out.println("3. Ecrire un message");
		System.out.println("4. Afficher tous les messages");
		System.out.println("5. Ajouter un ami");
		System.out.println("6. Afficher mes amis");
		System.out.println("7. Lister tous les utilisateurs");
		System.out.println("8. Effacer un messages");
		System.out.println("10. Quitter");
		
		try {
			menuItem = input.nextInt();
			}catch(Exception e){
				menuItem = 100;
			}
		input.nextLine(); // to enable to save another user after the menu
		return menuItem;
	}
	
	public static void menuSetUser(User user){
		
		if(user.getName().isEmpty()){
			System.out.println("Renseigner votre nom : ");
		}else{
			System.out.println("Modifier votre nom " + user.getName() + " ?");
		}
		user.setName(input.nextLine());
		
		if(user.getFirst_name().isEmpty()){
			System.out.println("Renseigner votre prénom : ");
		}else{
			System.out.println("Modifier votre prénom " + user.getFirst_name() + " ?");
		}
		user.setFirst_name(input.nextLine());
		
		if(user.getAge() > 0){
			System.out.println("Modifier votre age de " + user.getAge() + " ans ?");
		}else{
			System.out.println("Renseigner votre age : ");
		}
 
		user.setAge(input.nextInt());		
		
		//a faire -> la vérification du nom...
	}
		
	public static void saveFriends(ArrayList<User> listUsers, User user){
		//display the list of users
		String choice = new String();
		
		for(User userOne : listUsers){
			if (!user.getListFriends().contains(userOne)){
				System.out.println(userOne.getName());	
			}
		}
		
		System.out.println("Choisissez votre ami (nom) :");
		choice = input.nextLine();
		for (User userOne : listUsers){
			if (choice.equals(userOne.getName())){
				user.addFriends(userOne);
				System.out.println("Utilisateur trouvé et enregistré!");
				break;
			}
		}
		System.out.println("Utilisateur non trouvé !");	
	}
	
	public static int menuDeleteMessage(ArrayList<Message> listMessage){
		int item = 0;
		
		System.out.println("Quelle message souhaitez vous effacez ? ");
		try {
			item = input.nextInt();
			}catch(Exception e){
				item = 0;
			}
		return item;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}