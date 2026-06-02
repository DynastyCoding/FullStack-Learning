package homework.week01;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("0=Scissors, 1=Rock, 2=Paper.");
        System.out.println("player A please enter:");
        int a = in.nextInt();
        while (a < 0 || a > 2) {
            System.out.println("input error. please re-enter.");
            a = in.nextInt();
        }

        System.out.println("player B please enter:");
        int b = in.nextInt();
        while (b < 0 || b > 2) {
            System.out.println("input error. please re-enter.");
            b = in.nextInt();
        }

        if ((a + 2) % 3 == b) {
            System.out.println("player A win!");
        } else if ((b + 2) % 3 == a) {
            System.out.println("player B win!");
        } else {
            System.out.println("draw!");
        }
        in.close();


    }
}
