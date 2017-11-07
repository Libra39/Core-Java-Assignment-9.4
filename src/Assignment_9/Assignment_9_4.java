/**
 * 
 */
package Assignment_9;																			// Package Declared
import java.util.TreeSet;																		// import TreeSet class from java util package
/**
 * Create a class called Employee with attributes: name, designation and salary. Insert employee objects into the TreeSet where default 
 * natural sorting order is ascending order of salaries. If two employees have the same salary then consider alphabetical orders 
 * of their names, and Write a comparator class to define customized sorting which is the alphabetical order of employee names. If two 
 * employees have the same name then consider designation for comparison. 
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */
public class Assignment_9_4 {																	// Class Declared 
	public static void main(String[] args) {													// main Method started 
		System.out.println("\nEmployee Information : \n");										// Print statement
		TreeSet<Employee> employeeNameDiff = new TreeSet<Employee>(new EmployeeName());			// Initialize TreeSet 
		employeeNameDiff.add(new Employee("Rahul",9000,"Operations manager"));					// add() method is used for adding an element to the ArrayList.
		employeeNameDiff.add(new Employee("Rahul",7000,"Office manager"));						// add() method is used for adding an element to the ArrayList.
		employeeNameDiff.add(new Employee("Tarun",5400,"Marketing manager"));					// add() method is used for adding an element to the ArrayList.
		employeeNameDiff.add(new Employee("Maya",5400,"Marketing manager"));					// add() method is used for adding an element to the ArrayList.
		System.out.println("==================================");								// Print statement
		System.out.println("Name\tSalary\tDesignation");										// Print statement
		System.out.println("==================================");								// Print statement	
		TreeSet<Employee> employeeSalaryDiff = new TreeSet<Employee>(new EmployeeSalary());		// Initialize TreeSet 
		employeeSalaryDiff.add(new Employee("Rahul",9000,"Operations manager"));				// add() method is used for adding an element to the ArrayList.
		employeeSalaryDiff.add(new Employee("Rahul",7000,"Office manager"));					// add() method is used for adding an element to the ArrayList.
		employeeSalaryDiff.add(new Employee("Tarun",5400,"Marketing manager"));					// add() method is used for adding an element to the ArrayList.
		employeeSalaryDiff.add(new Employee("Maya",5400,"Marketing manager"));					// add() method is used for adding an element to the ArrayList.
		  for(Employee employeeList:employeeSalaryDiff){										 
		  System.out.println(employeeList);}													// Print statement
		System.out.println("==================================");								// Print statement
		}
}																								// class Assignment_9_4 closed
