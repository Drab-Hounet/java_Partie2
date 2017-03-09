import java.util.ArrayList;
import java.util.Scanner;

public final class Navigation {
	
	private static Scanner input = new Scanner(System.in);
	
	public static User setUser(User utilisateur, ArrayList<User> listUsers){
		//setter to put an another user
		
		//verify if name is unique
		boolean unique = true; 
		String name = new String();
		
		while(unique){
			int compt = 0;
			System.out.println("Renseigner votre nom : ");
			name = input.nextLine();
			for(User userOne : listUsers){
				if(userOne.getName().equals(name)){
					compt++;
				}
			}
			if(compt == 0){
				utilisateur.setName(name);
				unique = false;
			}else{
				System.out.println("Attention " + name + " existe déjà!");
			}
		}
		
		System.out.println("Renseigner votre prénom : ");
		utilisateur.setFirst_name(input.nextLine());
			
		System.out.println("Renseigner votre age : ");
		utilisateur.setAge(input.nextInt());
		
		input.nextLine(); 
			
		return utilisateur;
		
	}
	
	public static int displayMenu(){
		
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
	
	public static boolean displayAndSaveUsers(ArrayList<User> listUsers, User user){
		
		//display the list of users
		
		String choice = new String();
		
		for(User userOne : listUsers){
			if (!user.listFriends.contains(userOne)){
				System.out.println(userOne.getName());	
			}
		}
		
		System.out.println("Choisissez votre ami (nom) :");
		choice = input.nextLine();
		for (User userOne : listUsers){
			if (choice.equals(userOne.getName())){
				user.addFriends(userOne);
				System.out.println("Utilisateur trouvé et enregistré!");
				return true;
			}
		}
				
		System.out.println("Utilisateur non trouvé !");	
		return false;
	}
	
	public static boolean carryOn(){
		//method to know if you have an another user to save
		
		String question = new String();
		System.out.println("Un autre utilisateur?(Y/N)");
		question = input.nextLine();
		return (question.equals("Y"))?true:false;
	}

	
	
}
