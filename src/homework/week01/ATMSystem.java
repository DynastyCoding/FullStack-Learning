package homework.week01;

import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter your account balance:");
        int bal = in.nextInt();
        System.out.println("enter your withdrawal amount:");
        int wit = in.nextInt();

        if (wit < 0) {
            System.out.println("incorrect withdrawal amount.");
        } else if (wit > bal) {
            System.out.println("insufficient balance.");
        } else if (wit % 100 == 0) {
            System.out.println("withdrawal successful.");
        } else {
            System.out.println("withdrawal amount must be a multiple of 100.");
        }
        in.close();

    }
}
