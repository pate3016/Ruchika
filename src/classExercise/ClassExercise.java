/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classExercise;

import java.util.Scanner;

/**
 *
 * @author Damini
 */
public class ClassExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter customer type: ");
        String custType = input.nextLine();
        System.out.print("Enter subtotal: ");
        int subTotal = input.nextInt();
        if (custType.equals("R")) {
            if (subTotal >= 250) {
                System.out.println("Discount percent: 25%");
                double discountAmount = subTotal * 0.25;
                System.out.println("Discounted Amount: $" + discountAmount);
                double Total = subTotal - discountAmount;
                System.out.println("Total: $" + Total);
            } else if (subTotal >= 100 && subTotal < 250) {
                System.out.println("Discount percent: 10%");
                double discountAmount = subTotal * 0.10;
                System.out.println("Discounted Amount: $" + discountAmount);
                double Total = subTotal - discountAmount;
                System.out.println("Total: $" + Total);
            } else {
                System.out.println("Discount percent: 0%");
                System.out.println("Discount Amount: $0");
                System.out.println("Total: $" + subTotal);
            }
        } else if (custType.equals("C")) {
            if (subTotal >= 250) {
                System.out.println("Discount percent: 30%");
                double discountAmount = subTotal * 0.30;
                System.out.println("Discounted Amount: $" + discountAmount);
                double Total = subTotal - discountAmount;
                System.out.println("Total: $" + Total);
            } else {
                System.out.println("Discount percent: 20%");
                double discountAmount = subTotal * 0.20;
                System.out.println("Discounted Amount: $" + discountAmount);
                double Total = subTotal - discountAmount;
                System.out.println("Total: $" + Total);
            }
        } else {
            System.out.println("Please enter R or C customer type");
        }
    }
}
