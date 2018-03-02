import java.io.*;
import java.util.*;

public class ArrEx4 {
	
	private File afile = null;
	private Scanner reader = null;
	private Person1[] persons;

	public ArrEx4() {
		
		persons = new Person1[10];
		readData();
		printData();
		Scanner scan = new Scanner(System.in);
		System.out.println("Which person would you like more information about? ");
		int id = scan.nextInt();
		
		printData(id);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrEx4 arex = new ArrEx4();
	}

	public void readData() {

		
		try {

			afile = new File("Payroll.txt");
			reader = new Scanner(afile);
			reader.useDelimiter(",");
		} catch (Exception ex) {
			System.out.println(ex);
		}
		int i = 0;
		while (reader.hasNext()) {
			
			int id = reader.nextInt();
			String name = reader.next();
			int hours = reader.nextInt();
			double payRate = reader.nextDouble();
			String payType = reader.next();			
			Person1 x = new Person1(id,name,hours,payRate,payType);
			persons[i] = x;
			i++;
			reader.nextLine();
		}

	}
	
	public void printData()
	{
		for(int i = 0; i<persons.length; i++)
		{
			persons[i].printInfo();
		}
	}
	
	public void printData(int id)
	{
		for(int i = 0; i< persons.length; i++)
		{
			if(persons[i].getId() == id)
			{
				persons[i].printInfo();
			}
		}
	}
	
	
	
}

