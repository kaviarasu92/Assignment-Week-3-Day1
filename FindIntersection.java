package assignment.day5;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int array1[]= {3,2,11,4,6,7};
        int array2[]= {1,2,8,4,9,7};
		int lengthofArrays1 = array1.length;
		int lengthofArrays2 = array2.length;
		
		for (int i=0;i<lengthofArrays1;i++)
		{
			for (int j=0;j<lengthofArrays2;j++)
				
			{
				//Checking the matching numbers
				if(array1[i]==array2[j])
				{
					System.out.println("Matching numbers" + array1[i]);

				}
			}

		}
			

		

        


	}

}
