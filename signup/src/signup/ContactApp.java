package signup;
/*
public class ContactApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactsDAO contactList = new ContactsDAO();
		Contact user1 = new Contact("John","Snow",123456789,"deep@deep.com");
		Contact user2 = new Contact("Jamie","Lannister",123456789,"deep@deep.com");
		Contact user3 = new Contact("Tyrion","Lannister",123456789,"deep@deep.com");

		
		contactList.addContact(user1);
		contactList.addContact(user2);
		contactList.addContact(user3);
		contactList.printContacts();		
	}

}
	*/

public class ContactApp{
	public static void main(String[] args) {
		ContactDAOSQL cds = new ContactDAOSQL();
		cds.printContacts();
		cds.addContact();
		cds.removeContact();
		cds.updateContact();
	}
}