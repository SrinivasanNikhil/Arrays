
public class ArrEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] names = {"Nikhil", "Akhil"};
		int[] ages = {90,92};
		double[] gpas = {3.0,3.2};
		
		Person[] persons = new Person[2];
		
		for(int i = 0; i < names.length; i++)
		{
			Person aPerson = new Person(names[i],ages[i],gpas[i]);
			persons[i] = aPerson;
		}
		
		
		for(int i = 0; i < persons.length; i++)
		{
			persons[i].printInfo();
		}
		
	}

}
