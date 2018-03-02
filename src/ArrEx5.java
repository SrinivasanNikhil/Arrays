
public class ArrEx5 {

	
	
	public static void main(String[] args) {
		

		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5};
		int[] uniqueNumbers = new int[10];
		int[] frequency = new int[10];
		
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
		
		for(int i = 0; i< uniqueNumbers.length; i++)
		{
			System.out.println(uniqueNumbers[i] + " " + frequency[i]);
		}
		
		
		
		
	}

}
