package week1.Day3;

public class Palindrome {

	public static void main(String[] args) {
		String myName ="madam";  
	      String revName="";
	      int strLength = myName.length(); 
	      
	      for (int i = (strLength - 1); i >= 0; i--) 
	      {
	         
	    	  revName = revName + myName.charAt(i);
	      }  
	      if (myName.equals(revName)) {
	          System.out.println(myName + " is a Palindrome String.");
	        }
	        else {
	          System.out.println(myName + " is not a Palindrome String.");
	        }
	}

}
