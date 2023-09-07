package ConstructorExamples;

public class TestEmployee {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub Programmer p = new Programmer();
		 * System.out.println(p.bonus); //System.out.println(p.salary); Tester t = new
		 * Tester();
		 */
		
		Address ad = new Address("Pune", "MH", "India");
		Address ad1 = new Address("Noida", "Delhi", "India");
		
		
		Employee e = new Employee(101, "Mrunmayi", ad);
	    Employee e1 = new Employee(102, "Amruta", ad1);
	    
	    e.display();
	    e1.display();
	}

}
