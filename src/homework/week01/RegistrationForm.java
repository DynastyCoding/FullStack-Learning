package homework.week01;

import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("please enter your name:");
        String name = in.nextLine();

        System.out.println("please enter your ages:");
        int ages = in.nextInt();

        in.nextLine();

        System.out.println("please enter your phone numbers:");
        String phone = in.nextLine();

        System.out.println("Do you agree to the terms(T/F)?");
        Boolean agree = in.nextBoolean();

        System.out.printf("name：%s%n", name);
        System.out.printf("ages：%d%n", ages);
        System.out.printf("phone：%s%n", phone);
        System.out.printf("agree?：%b%n", agree);


    }

}
