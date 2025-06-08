package assignment.day5;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="stops";
		String text1="potss";
		
		//Find the length of string
		
		int lengthofstring=text.length();
		int lengthofstring2=text1.length();
		
		//check the length
		
		if(lengthofstring!=lengthofstring2)

		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			return;
		}		
		
		char[] charArray = text.toCharArray();
		char[] charArray1 = text1.toCharArray();

		
		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		
		if(Arrays.equals(charArray, charArray1))
		{
			
			System.out.println("The given strings are Anagram");

		}
		
		else
		{
			System.out.println("The given strings is not Anagram");

		}

		
}

}
