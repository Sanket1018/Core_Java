package stream;

public class Employee {
	String name;
	int age;
	double salary;
	String country;
	
	public Employee(String name,int age,double salary,String country)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", country=" + country + "]";
	}
		
	
	
}
