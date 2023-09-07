package ConstructorExamples;

public class Employee {
//float salary = 45000f;// properties
int id;
String name;
Address address;


public Employee(int id , String name, Address address) {
	
	this.id= id;
	this.name= name;
	this.address= address;
}

void display() {
	System.out.println(id+" "+ name);
	System.out.println(address.city+" "+ address.country + address.state);
}
}
