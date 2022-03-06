package ConstructorType5;

import java.util.Scanner;



public class ConstructorType5 {
	private String name;  
	private int age;    
	public ConstructorType5(String name, int age)  
	{  
	this.name =name;  
	this.age = age;  
	}    
	public ConstructorType5()  
	{  
	this.name = "Prashanti";  
	this.age = 23;  
	}  
	public void show()  
	{  
	System.out.println("Name of the student is: "+this.name);  
	System.out.println("Age of the student is: "+this.age);  
	}  
	public static void main(String args[])   
	{  
	ConstructorType5 c =new ConstructorType5();   
	Scanner sc = new Scanner(System.in);  
	System.out.println("Enter the name of the student: ");  
	String name = sc.nextLine();  
	System.out.println("Enter the age of the student: ");  
	int age = sc.nextInt();  
	System.out.println(" ");   
	System.out.println("Show() method for the parameterized constructor: ");  
	new ConstructorType5(name, age).show();    
	System.out.println("Show() method for the default constructor: ");  
	new ConstructorType5().show();  
	}  


}
