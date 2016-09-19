package javaBasics;
import java.util.Scanner;

class Employee
{
	int age;
	String name;

public Employee(String name, int age)
{
	this.age=age;
	this.name=name;
}

public void display()
{
System.out.println(name + "\t" + age);
}
}

public class EmpTest
{
public static void main(String args[])
{
	Scanner in = new Scanner(System.in);

	int age;
	String na	;

	Employee e[] = new Employee[5];		// e is object array

	for(int i=0; i<5; i++) {
		System.out.println("enter name, age");
		na=in.next();
		age=in.nextInt();
		e[i] = new Employee(na, age);
		}

	for(Employee t : e) {		//for(int i=0; i<5; i++)
	    t.display();						// 	e[i].display();
	}
}
}
