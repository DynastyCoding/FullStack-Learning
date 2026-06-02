package homework.week01;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("請輸入0~1000的整數");
		int num = in.nextInt();
		int sum = (num / 100) + (num / 10) % 10 + (num % 10);
		System.out.printf("各位數總和為：%d", sum);

		in.close();
	}
}
