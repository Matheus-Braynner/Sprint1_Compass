package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		System.out.println("|------------------------------|");
		System.out.println("|                              |");
		System.out.println("|          NordesTeam          |");
		System.out.println("|                              |");
		System.out.println("|------------------------------|");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("How many employess do you want to add ? ");
		int n = sc.nextInt();
		
		Employee[] emp = new Employee[n];
		
		for (int i = 0; i < emp.length; i++) {
		sc.nextLine();
		System.out.print("Employee name: ");
		String name = sc.nextLine();
		System.out.print("Employee gross Salary: ");
		double grossSalary = sc.nextDouble();
		emp[i] = new Employee(name, grossSalary);
		}
		
		System.out.println();
		
		System.out.println("List of employees:");
		for (Employee e : emp) {
			System.out.println(e);
			System.out.println();
		}		
		
		sc.close();
		
		
	
	}

}
