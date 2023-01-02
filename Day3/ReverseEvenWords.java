package week1.Day3;

public class ReverseEvenWords {

	 public void reverseWordInMyString(String test)
	   {
		 
		String[] words = test.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		
		System.out.println(reversedString);
	   }
	   public static void main(String[] args) 
	   {
		   ReverseEvenWords obj = new ReverseEvenWords();
		obj.reverseWordInMyString("I am a software tester");
	   }
	}
