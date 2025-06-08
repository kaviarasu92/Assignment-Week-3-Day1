package assignment.day5;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String text = "We learn Java basics as part of java sessions in java week1";
        String[] words = text.split(" "); // split the sentence into words
        int count = 0; // to track number of duplicate words found

        // Outer loop to pick each word
        for (int i = 0; i < words.length; i++) {
            // Skip empty strings already replaced
            if (words[i].equals("")) continue;

            // Inner loop to compare with remaining words
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    words[j] = ""; // replace duplicate with empty string
                    count++;
                }
            }
        }

        // Print result if duplicates found
        if (count > 0) {
            System.out.println("Modified text after removing duplicates:");
            for (String word : words) {
                System.out.print(word + " ");
            }
        } else {
            System.out.println("No duplicate words found.");
        }
    }
}
