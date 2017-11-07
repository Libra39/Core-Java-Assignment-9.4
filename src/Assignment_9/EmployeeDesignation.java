/**
 * 
 */
package Assignment_9;
import java.util.Comparator;
public class EmployeeDesignation implements Comparator<Employee>{								    	            // Comparator interface is used to order the objects of user-defined class
    public int compare(Employee myEmployee1, Employee myEmployee2) {						            // compare() method is an interface which is used for sorting objects
        return myEmployee1.getEmployeeDesignation().compareTo(myEmployee2.getEmployeeDesignation());	// The method compareTo() is used for comparing two strings lexicographically
    }																						            // compare() method closed
}   																						            // class EmployeeName closed

