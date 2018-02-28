
public class Person {

	private String name;
	private int age;
	private double gpa;
	
	
	public Person(String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}


	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	public void printInfo()
	{
		System.out.println(name + " " + age + " " + gpa);
	}
	
	
}
