/**
 * Denver Wolfe
 * CH7PC3 - Charge Account Validation
 * Programming III - AP CS
 * 12/19/18
 */

import java.util.Scanner;

public class ChargeAccountValidation {

    public static void main(String[] args) {
        //Create Array
        String [] account = {"5658845", "4520125", "7895122", "8777541",
            "8451277", "1302850", "8080152", "4562555", "5552012", "5050552",
            "7825877", "1250255", "1005231", "6545231", "3852085", "7576651",
            "7881200", "4581002"};
        
        //Declare variable
        String verify;

        //Create Scanner
        Scanner kb = new Scanner(System.in);

        //Ask for account number
        System.out.print("Enter an account number: ");
        verify = kb.next();

        //Verify
        int c = 0;
        for (int x = 0; x < account.length; x++) {
            if (verify.equals(account[x])) {
                c = 1;
                break;
            }
        }

        if (c == 0) {
            System.out.print("The account number is invalid.");
        }

        if (c == 1) {
            System.out.print("The account number is valid.");
        }
    }
}
