/**
 * Denver Wolfe
 * CH7PC2 - Payroll
 * Programming III - AP CS
 * 12/20/18
 */

public class PayrollDemo {

    public static void main(String[] args) {
        
        //Create New Payroll Object
        Payroll payroll = new Payroll();
        
        //Set Hours and Pay Rate and Calculate Wages
        payroll.setHoursAndPayRate();
        payroll.setWages();
        
        //Print Out Chart Of Employee's Gross Pay
        payroll.EmployeeChart();
        
        
    }

}
