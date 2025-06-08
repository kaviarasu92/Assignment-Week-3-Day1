package assignment.day5;

public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
        char[] charArray = test.toCharArray();

		int lengthofstring=test.length();
		
        for (int i = lengthofstring - 1; i >= 0; i--) {
            // Find the odd index
            if (i % 2 != 0) {
                // Change the character to uppercase
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
            
           // System.out.println(charArray);
        }

        // Print the modified characters as a String
        System.out.println(charArray);


		

	}

}
