
public class Main {

	public static void main(String[] args) {

		String fullName = "Donald Duck";
		String firstName = "";
		String surName = "";
		
		int spacePosition = fullName.indexOf(" ");
		firstName = fullName.substring(0,spacePosition);
		System.out.println("First Name: " + firstName);		
	
		surName = fullName.substring(spacePosition+1);
		System.out.println("Surname: " + surName);
	
		}
	
}
	

//version a is all in one block
//version b has functions
//version c has functions that use return
//version d has main class and nameManager class