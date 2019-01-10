/**
 * Denver Wolfe
 * CH7PC6 - Quarterly Sales Statistics
 * Programming III - AP CS
 * 1/7/19
 */

import java.util.Scanner;

public class QuarterlySalesStatistics {

    public static void main(String[] args) {
        //Random Note:
        //Only Do These:
        //A List of The Sales Figures By Divison
        //The Total Sales For The Quarter
        //The Average Sales For All Divisions That Quarter
        //The Division With The Highest Sales For That Quarter

        //[r][c]
        double[][] sales = new double[6][4];
        double[] tot = new double[4];
        double[] avg = new double[4];
        double[] high = new double[4];

        Scanner kb = new Scanner(System.in);

        for (int c = 0; c < sales[0].length; c++) {
            for (int r = 0; r < sales.length; r++) {
                System.out.print("Enter the sales figure for Division "
                        + r + " in Quarter " + (c + 1) + ": ");
                sales[r][c] = kb.nextInt();
                while (sales[r][c] < 0) {
                    System.out.println("Sales figure cannot be negative.");
                    System.out.print("Enter the sales figure for Division "
                            + r + ": ");
                    sales[r][c] = kb.nextInt();
                }
                System.out.print("\n");
            }

            for (int r = 0; r < sales.length; r++) {
                tot[c] += sales[r][c];
                if (high[c] < sales[r][c]) {
                    high[c] = sales[r][c];
                }
            }
        }

        for (int c = 0; c < sales[0].length; c++) {
            System.out.println("Quarter " + (c + 1));
            System.out.println("Total Sales: " + tot[c]);
            System.out.println("Average Sales: " + avg[c]);
            System.out.println("Highest Sales: " + high[c]);
        }
    }
}