package HomeWork.Week01;

public class GiftSwap {
	public static void main(String[] args) {
		String boxA = "Macbook";
		String boxB = "iPhone";

		System.out.println("交換前：A箱是" + boxA + ", B箱是" + boxB);
		
		String temp = null;
		 temp = boxA;
		 boxA = boxB;
		 boxB = temp;
		
		System.out.println("交換後：A箱是" + boxA + ", B箱是" + boxB);

	}
}
