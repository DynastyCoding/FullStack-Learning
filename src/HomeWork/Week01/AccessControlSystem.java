package HomeWork.Week01;

import java.util.Scanner;

public class AccessControlSystem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("please enter your age:");
        int age = in.nextInt();
        System.out.println("have pass?(1:have/2:no)");
        int pass = in.nextInt();

        if (age < 0) {
            System.out.println("age entered incorrect");
        } else if (age >= 18) {
            if (pass == 1) {
                System.out.println("passage successful");
            } else if (pass == 0) {
                System.out.println("please apply pass first.");
            }
        } else {
            System.out.println("No entry");
        }
        in.close();


    }
}
