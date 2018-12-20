/**
 * Denver Wolfe
 * CH7PC2 - Payroll
 * Programming III - AP CS
 * 12/20/18
 */

import java.util.Scanner;

public class Payroll {
    
    //Create New Scanner
    Scanner kb = new Scanner(System.in);
    
    //Create New Arrays For Employee's IDs, Hours Worked, Pay Rate, And Wages
    final int [] EMPLOYEEID = {5658845, 4520125, 7895122, 8777541, 8451277, 
        1302850, 7580489};
    int [] hours = new int[8];
    double [] payRate = new double[8];
    double [] wages = new double[8];
    
    /**
     * The setHoursAndPayRate Method Receives The Amount Of Hours Worked
     * And Pay Rate
     */
    public void setHoursAndPayRate(){
        for(int x = 0; x < EMPLOYEEID.length; x++){
            //Get The Amount Of Hours Worked For Employees
            System.out.print("Enter the hours worked for employee " 
                    + EMPLOYEEID[x] + ": ");
            hours[x] = kb.nextInt();
            
            //Check If Employee's Hours Are 0 Or Greater
            while (hours[x] < 0){
                System.out.println("Hours worked must be 0 or greater.");
                System.out.print("Enter the hours worked for employee "
                        + EMPLOYEEID[x] + ": ");
                hours[x] = kb.nextInt();
            }
            
            //Get The Pay Rate For Employees
            System.out.print("Enter the pay rate for employee " 
                    + EMPLOYEEID[x] + ": ");
            payRate[x] = kb.nextDouble();
            
            //Check If Employee's Pay Rate Is $6 Or Higher
            while (payRate[x] < 6.00){
                System.out.println("Pay rate must be $6 or greater.");
                System.out.print("Enter the pay rate for employee "
                    + EMPLOYEEID[x] + ": ");
                payRate[x] = kb.nextDouble();
            }
        }
    }
    
    /**
     * The setWages Method Calculates The Gross Pay For Each Employee
     */
    public void setWages(){
        for (int x = 0; x <EMPLOYEEID.length; x++){
            wages[x] = payRate[x] * hours[x];
        }
    }
    
    /**
     * The EmployeeChart Method Prints Out Each Employee's ID And Gross Pay
     */
    public void EmployeeChart(){
        System.out.println("\r");
        for (int x = 0; x < EMPLOYEEID.length; x++) {
            System.out.println("Employee " + EMPLOYEEID[x]);
            System.out.println("Gross Pay: $" + wages[x]);
            System.out.println("\r");
        }
    }
}
