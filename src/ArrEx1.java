import java.util.Scanner;

public class ArrEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//The two ways to declare the array
		String[] names = new String[4];
		int[] ages = {90,21,34,45};
		
		
		String aname = "Humpty";
		//array elements start at 0 called an index, size of array given by .length attribute
		
		
		names[0] = "Nikhil";
		names[1] = "Akhil";
		names[2] = "Nandita";
		names[3] = "Nick";
		
		
		for(int i =0; i< names.length; i++)
		{
			System.out.print(names[i] + " " + ages[i]);
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
