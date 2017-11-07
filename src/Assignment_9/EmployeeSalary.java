package Assignment_9;														// Package declared
import java.util.Comparator;												// import class Comparator from java util package
public class EmployeeSalary implements Comparator<Employee>{				// Comparator interface is used to order the objects of user-defined class.
    public int compare(Employee myEmployee, Employee myNextEmployee) {		// compare() method is an interface which is used for sorting objects
             int newEmployeeSalary1 = myEmployee.getEmployeeSalary();		// new object declared
             int newEmployeeSalary2 = myNextEmployee.getEmployeeSalary();	// new object declared
            if (newEmployeeSalary1 > newEmployeeSalary2)					// If loop to compare the objects				
           	  return 1;
            else {
                return -1; }										
      }																		// compare() method closed
}																			// class EmployeeSalary closed