
public class Reseau_social {

	public static void main(String[] args) {
		
		GroupUser group = new GroupUser();
		
		//add users by default------------------------------------
		User bob = new User("bob", "hin", 25 );
		group.addUser(bob);
		Message messageBob = new Message();
		messageBob.setContent();
		bob.addMessage(messageBob);
		User agathe = new User("agathe", "zebluz", 35 );
		group.addUser(agathe);
		User jacques = new User("Jacques", "iémichelle", 15 );
		group.addUser(jacques);
		User bruce = new User("bruce", "hel", 89 );
		group.addUser(bruce);
		//--------------------------------------------------------
		
		NavGeneral nav = new NavGeneral();
		nav.menu(group);
	}

}
