package assignment.day5;

public class ReverseString {

	public static void main(String[] args) {
		
		String companyName = "TestLeaf";

        // Convert the String to a character array
        char[] charArray = companyName.toCharArray();
        //Length of string
		int lengthofstring=companyName.length();


        System.out.print("Reversed String: ");

        // Loop from end to start
        for (int i = lengthofstring  - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }

	}


