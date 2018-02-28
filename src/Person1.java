
public class Person1 {

	private int id;
	private String name;
	private int hours;
	private double payRate;
	private String type;
	
	
	public Person1(int id, String name, int hours, double payRate, String type) {
		this.id = id;
		this.name = name;
		this.hours = hours;
		this.payRate = payRate;
		this.type = type;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}


	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}


	/**
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}


	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	public void printInfo()
	{
		System.out.println(name + " " + hours + " " + payRate);
	}
	
}
