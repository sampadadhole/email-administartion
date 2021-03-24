package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private int passwordlength =10;
	private String department;
	private int mailBoxCapacity=500;
	private String email;
	private String alternateMail;
	private String companySuffix = "company.com";
	
	//constructor to recieve firstname and lastname
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.println("Email created: "+this.firstName +" "+this.lastName);
		
		
	//call a method asking for department -return department
	this.department = setDepartment();
//	System.out.println("DEPARTMENT: "+this.department);
	
	//call a method that returns a random password
	this.password = setPassword(passwordlength);
	System.out.println("Your Password: "+this.password);
	
	//combine elements to generate email
	email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+ department+"."+ companySuffix;
//	System.out.println("Your email: "+email);
	}
	
	
	//ask for the department
	private String setDepartment() {
		System.out.print("New Worker:" + " "+firstName +"\nDepartment codes:\n1 Sales\n2 Development\n3 Accounting\n0 none\n Enter department code:");
		Scanner in= new Scanner(System.in);
		int DepChoice = in.nextInt();
		if(DepChoice == 1) { return "Sales";}
		else if(DepChoice == 2) { return "Development";}
		else if(DepChoice == 3) { return "Accounting";}
		else { return " ";}
	}
	
	//Generate a random password
	private String setPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@!#$%&";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setMailBoxCapacity(int capacity)
	{
		this.mailBoxCapacity = capacity; 
	}
	
	//set the alternate email address
	public void setAlternateEmail(String altEmail) {
		this.alternateMail = altEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//getting the methods
	
	public int getMailCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateMail;}
	public String password() {return password;}
	
	//displaying name, email and mailboxcapacity
	public String showInfo()
	{
		return "NAME:" + " " + firstName+ " " +lastName +
				"\nEMAIL:" +" "+ email+
				"\nMAILBOX CAPACITY:"+" "+mailBoxCapacity+ "mb";
	}
}
