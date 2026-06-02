package homework.week02;

import java.util.Scanner;

public class FirstProductOverN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a positive integer:");
        int n = in.nextInt();

        outer:
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j >= n) {
                    System.out.printf(
                            "The first group of combinations whose " +
                                    "product is greater than %d is: %d%n", n, i * j);
                    break outer;
                }
            }
        }
    }
}
