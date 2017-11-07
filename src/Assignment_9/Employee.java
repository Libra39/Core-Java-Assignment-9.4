/**
 * 
 */
package Assignment_9;																				// Package Declared
public class Employee {																				// Employee class declared
	private String EmployeeName;																	// Private String variable declared
    private int EmployeeSalary;																		// Private Integer variable declared
    private String EmployeeDesignation;
    
    public Employee(String EmployeeName, int EmployeeSalary, String EmployeeDesignation) {			// Parameterized constructor created
        this.EmployeeName = EmployeeName;								                            // This keyword is used to distinguish between class variables and instance variables
        this.EmployeeSalary = EmployeeSalary;														// This keyword is used to distinguish between class variables and instance variables
     	this.EmployeeDesignation = EmployeeDesignation;}
    
    public String getEmployeeName() {																// getter created
        return EmployeeName;}
    
    public void setEmployeeName(String EmployeeName) {												// setter created
        this.EmployeeName = EmployeeName;}															// This keyword is used to distinguish between class variables and instance variables
    
    public int getEmployeeSalary() {																// getter created
        return EmployeeSalary;}
    
    public void setSalary(int EmployeeSalary) {														// setter created
        this.EmployeeSalary = EmployeeSalary;}														// This keyword is used to distinguish between class variables and instance variables
    
    public String getEmployeeDesignation() {														// getter created
        return EmployeeDesignation;}
    
    public void setEmployeeDesignation(String EmployeeDesignation) {								// setter created
        this.EmployeeDesignation = EmployeeDesignation;}											// This keyword is used to distinguish between class variables and instance variables
        
    public String toString(){																		// toString() method returns the string representation of the object
        return this.EmployeeName+"\t"+this.EmployeeSalary+"\t"+this.EmployeeDesignation;}

}																									// class Employee closed
