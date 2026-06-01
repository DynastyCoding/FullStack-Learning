package HomeWork.Week01;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("請輸入華氏溫度：");
		double f = in.nextDouble();
		double c = (f-32)*5/9;
		String result = (c<=10)?"天氣很冷，記得穿外套！":"天氣還不錯！";
		System.out.printf("攝氏溫度為%f,%s",c,result);
		in.close();
		
		
	}
}
