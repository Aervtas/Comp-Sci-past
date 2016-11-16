package studentCode;
/** Here we provide a concrete implementation of the Person interface so 
 * that we can do some tests with it.
 */


//You decide how to make this implement Person!
public class AnotherExamplePerson implements Person {
	private String name;
	private int salary;
	//You'll need to add more instance fields and implement many methods...
	
	//IMPORTANT NOTES:
	//The starting salary for new objects is 5000, unless you are doing
	//    the copyMe, in which case it should copy the existing salary.
	//Your toString method needs to print AEP: name(salary) based on 
	//    the object's information.
	
	
	
	public AnotherExamplePerson(){
		salary = 5000;
	}
	
	public AnotherExamplePerson(int sal){
		salary = sal;
	}
	
	//As always, we do this one for you...
	public boolean equals(Object other) {
		if (other==null) {
			return false;
		}
		try {
			AnotherExamplePerson local = (AnotherExamplePerson)other;
			return this.name.equals(local.name);
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public Person copyMe() {
		return new AnotherExamplePerson(salary);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSalary() {
		return salary;
	}

	@Override
	public void acceptRaise(int amount) {
		salary += amount;
	}
	
	public String toString(){
		return "AEP: "+getName()+"("+getSalary()+")";
	};
}