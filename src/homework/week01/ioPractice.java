package homework.week01;
import java.util.Scanner;
public class ioPractice {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("please enter your name:");
        String name = in.nextLine();

        System.out.println("please enter your ages:");
        int age = in.nextInt();

        in.nextLine();

        System.out.println("please enter a sentence:");
        String talk = in.nextLine();

        System.out.printf("Your name：%s%n",name);
        System.out.printf("Your ages：%d%n",age);
        System.out.printf("Your sentence：%s%n",talk);

    }

}
