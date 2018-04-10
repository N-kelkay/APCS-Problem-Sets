package net.mrpaul.PB150.ps12;

import java.io.IOException;

/**           
* Uses the comparable method by implementing the interface Comparable
*
*<p> after implementing Comparable, it compares a user information to another
* user information and returns if they are equal <p>
*APCS PS150: Sort it out
*Date
* 
*
*@author Natenael Kelkay
*/
public class Person implements Comparable <Person>{
	private String lastName, firstName, emailAddress, userName; 
	private int numFriends;
	
	public Person () {
		lastName = "";
		firstName = "";
		emailAddress = "";
		userName = "";
		numFriends = 0;
	}
	
	public Person (String lastName, String firstName, String emailAddress, String userName, int numFriends){
		this.lastName = lastName;
		this.firstName = firstName;
		this.emailAddress = emailAddress;
		this.userName = userName;
		this.numFriends = numFriends;
	}
	
	//Getters and Setters
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getNumFriends() {
		return numFriends;
	}

	public void setNumFriends(int numFriends) {
		this.numFriends = numFriends;
	}
	
	//default implementation of equals, as in the Object class
	@Override
	public boolean equals(Object obj){
		if(obj == null) {
			return false;
		}else 
		{
			return this == obj;
		}
	}
	
	// overrides the default implementation of hashCode !
	@Override
	public int hashCode(){
        int hash = 3;
        hash = hash * 9 + userName.hashCode();
        hash = hash * 17 + numFriends;
        hash = hash * 7 + firstName.hashCode();
        hash = hash * 31 + lastName.hashCode();
        hash = hash * 5 + emailAddress.hashCode();
        return hash;
    }

	@Override
	public int compareTo(Person other) {
		int returnNum = 0;
		
		if(other == null) {
			try {
				throw new IOException("The 'Person' object cannot be null");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		else {
			//Compare lastName
			if(this.lastName.compareTo(other.getLastName()) < 0) {
				return  -1;
			}
			if(this.lastName.compareTo(other.getLastName()) > 0) {
				return  1;
			}
			
			//Compare firstName
			if(this.firstName.compareTo(other.getFirstName()) < 0) {
				return -1;
			}
			if(this.firstName.compareTo(other.getFirstName()) > 0) {
				return 1;
			}
			
			//Compare userName
			if(this.userName.compareTo(other.getUserName()) < 0) {
				return -1;
			}
			if(this.userName.compareTo(other.getUserName()) > 0) {
				return 1;
			}
			
			//Compare emailAddress
			if(this.emailAddress.compareTo(other.getEmailAddress()) < 0) {
				return -1;
			}
			if(this.emailAddress.compareTo(other.getEmailAddress()) > 0) {
				return 1;
			}
			
			//Compare numFriends
			if(this.numFriends > this.numFriends) {
				return 1;
			} 
			
			if(this.numFriends < this.numFriends) {
				return-1;
			}
			
			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Nate", "Kelkay", "natikelkay@gmail.com", "n-kelkay", 0);
		Person p2 = new Person("Nate", "Kelkay", "natikelkay@gmail.com", "n-kelkay", 0);
		
		System.out.println(p1.compareTo(p2));
	}
}
