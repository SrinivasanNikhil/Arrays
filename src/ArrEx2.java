import java.util.Scanner;

public class ArrEx2 {

	public static void main(String[] args) {

		double[] gradeRange = {93.00, 90.00, 87.00, 83.00, 80.00, 77.00, 73.00, 70.00, 60.00, 0.00}; 
		String[] grade = {"A","A-","B+","B","B-","C+","C","C-","D","F"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in your numberical grade >");
		double numGrade = scan.nextDouble();
		
		for(int i = 0; i < gradeRange.length; i++)
		{
			if(numGrade >= gradeRange[i])
			{
				System.out.println(grade[i]);
				break;
			}
		}
		
	}

}
