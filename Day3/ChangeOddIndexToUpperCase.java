package week1.Day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String myName="changeme";
	
		char[] name= myName.toCharArray();
		
		    for(int i = 0; i<name.length; i++) { {
		    {
		    	if(i%2==0) {
		    		char a = myName.charAt(i);
		    		char upper1 = Character.toUpperCase(a);  
		    	
		    		System.out.println(upper1);
		    	}
		    	
		    	}
		    }
		    }
	}
}
	
