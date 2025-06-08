package assignment.day5;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";

        // Split the sentence into words
        String[] words = test.split(" ");

        // Loop through each word
        for (int i = 0; i < words.length; i++) {
            // If index is odd (1, 3, ...)
            if (i % 2 != 0) {
                // Convert word to character array
                char[] charArray = words[i].toCharArray();

                // Reverse and print the characters
                for (int j = charArray.length - 1; j >= 0; j--) {
                    System.out.print(charArray[j]);
                }
            } else {
                // Even index word, print as it is
                System.out.print(words[i]);
            }
            // Print space after each word
            System.out.print(" ");

	}

}

}