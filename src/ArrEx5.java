
public class ArrEx5 {

	
	
	public static void main(String[] args) {
		

		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,11,12,13,13,13,14};
		int[] uniqueNumbers = new int[20];
		int[] frequency = new int[20];
		
		uniqueNumbers[0] = numbers[0];
		
		for(int i = 0; i<numbers.length;i++)
		{
			boolean exists = false;
			int j = 0;
			while(j<uniqueNumbers.length && uniqueNumbers[j] != 0 && !exists)
			{
				if(uniqueNumbers[j] == numbers[i])
				{
					frequency[j] = frequency[j] + 1;
					exists = true;
					break;
				}
				j++;
			}
			
			if(!exists)
			{
				uniqueNumbers[j] = numbers[i];
				frequency[j] = frequency[j]  + 1; 
			}
			
		}
		
		
		//print out unique numbers and frequency
		for(int i = 0; i< uniqueNumbers.length && uniqueNumbers[i] != 0; i++)
		{
			System.out.println(uniqueNumbers[i] + " " + frequency[i]);
		}
		
		
		
		
	}

}
