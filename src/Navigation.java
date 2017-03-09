import java.util.ArrayList;
import java.util.Scanner;

public class Navigation {
	
	private Scanner input = new Scanner(System.in);
	
	public User setUser(User utilisateur){
		//setter to put an another user
		
		System.out.println("Renseigner votre nom : ");
		utilisateur.setName(input.nextLine());
		
		System.out.println("Renseigner votre prénom : ");
		utilisateur.setFirst_name(input.nextLine());
			
		System.out.println("Renseigner votre age : ");
		utilisateur.setAge(input.nextInt());
		
		input.nextLine(); 
			
		return utilisateur;
		
	}
	public int displayMenu(){
		//display the general menu		
		
		System.out.println("Choisissez :");
		System.out.println("1. Afficher votre profil");
		System.out.println("2. Ecrire un message");
		System.out.println("3. Afficher tous les messages");
		System.out.println("4. Ajouter un ami");
		System.out.println("5. Afficher mes amis");
		System.out.println("6. Ajouter des utilisateurs");
		System.out.println("7. Lister tous les utilisateurs");
		System.out.println("8. Modfication du profil");
		System.out.println("10. Quitter");
		
		int menuItem = input.nextInt();
		input.nextLine(); // to enable to save another user after the menu
		return menuItem;
	}
	
	public boolean displayListUsers(ArrayList<User> listUsers, User user){
		//display the list of users
		
		String choice = new String();
		for (int i = 0 ; i < listUsers.size() ; i++ ){
			System.out.println(listUsers.get(i).getName());
		}
		System.out.println("Choisissez votre ami (nom) :");
		choice = input.nextLine();
		for (int i = 0 ; i < listUsers.size() ; i++ ){
			if (choice.equals(listUsers.get(i).getName())){
				user.addFriends(listUsers.get(i));
				System.out.println("Utilisateur trouvé et enregistré!");
				return true;
			}
		}
		System.out.println("Utilisateur non trouvé !");	
		return false;
	}
	
	public boolean carryOn(){
		//method to know if you have an another user to save
		
		String question = new String();
		System.out.println("Un autre utilisateur?(Y/N)");
		question = input.nextLine();
		return (question.equals("Y"))?true:false;
	}

	
	
}
