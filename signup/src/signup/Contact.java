package signup;

public class Contact {
private String firstName;
private String lastName;
private int phoneNumber;
private String emailAddress;



public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public Contact(String firstName, String lastName, int phoneNumber, String emailAddress) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNumber = phoneNumber;
	this.emailAddress = emailAddress;
}
}
