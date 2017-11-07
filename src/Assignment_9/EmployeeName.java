/**
 * 
 */
package Assignment_9;																		// Package declared
import java.util.Comparator;																// import class Comparator from java util package
public class EmployeeName implements Comparator<Employee>{									// Comparator interface is used to order the objects of user-defined class
    public int compare(Employee myEmployee, Employee myNextEmployee) {						// compare() method is an interface which is used for sorting objects
        return myEmployee.getEmployeeName().compareTo(myNextEmployee.getEmployeeName());	// The method compareTo() is used for comparing two strings lexicographically
    }																						// compare() method closed
}   																						// class EmployeeName closed
