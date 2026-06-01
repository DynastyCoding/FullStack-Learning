package HomeWork.Week01;

import java.util.Scanner;

public class WarehouseSystem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("please enter your identification code:");
        int id = in.nextInt();

        if (id <= 0) {
            System.out.println("Error:invalid ID.");
        } else if (id % 2 == 0 && id % 7 == 0) {
            System.out.println("VIP channel.");
        } else if (id < 100) {
            System.out.println("Manual inspection.");
        } else if (id <= 1000) {
            if (id % 2 == 1) {
                System.out.println("Area A Conveyor belt");
            } else {
                System.out.println("Area B Conveyor belt");
            }
        } else {
            System.out.println("Large cargo area");
        }
        in.close();
    }
}
