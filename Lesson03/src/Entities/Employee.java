package Entities;

public class Employee {
	private String name;
	private Double grossSalary;	
	
	public Employee () {
		
	}

	public Employee(String name, Double grossSalary) {
		this.name = name;
		this.grossSalary = grossSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}
	
	
	public Integer taxPercentage() {
		if (grossSalary > 0 && grossSalary <= 1000) {
			return 20;
		} else if (grossSalary > 1000.00 &&  grossSalary <= 2000) {
			return 10;
		} else {
			return 10;
		}
	}
	
	public Double netSalary() {
			if (grossSalary > 0.00 && grossSalary <= 1000.00) {
				return grossSalary += grossSalary * taxPercentage() / 100.0;
			} else if (grossSalary > 1000.00 &&  grossSalary <= 2000.00) {
				return grossSalary += grossSalary * taxPercentage() / 100.0;
			} else {
				return grossSalary -= grossSalary * taxPercentage() / 100.0;
			}
			
	}
	
	public String toString() {
		return getName() 
			+ ", your salaray is: $"
			+ String.format("%.2f", grossSalary)
			+ "\nbonus or discout: "
			+  grossSalary * taxPercentage() / 100.00
			+ "\nNetSalary: "
			+ String.format("%.2f", netSalary());
	}

	
}
