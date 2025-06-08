package assignment.day5;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int input[]= {1,4,3,2,8, 6,7};
		Arrays.sort(input);
		int lengthofArrays = input.length;

		
        // Loop from the first element to the last
        for (int i = 0; i < lengthofArrays - 1; i++) {
            // check if the next number is not exactly 1 more
            if (input[i + 1] != input[i] + 1) {
                // Print the missing number
                System.out.println("Missing number is: " + (input[i] + 1));
                break;
            }


		
	}

	}
}
