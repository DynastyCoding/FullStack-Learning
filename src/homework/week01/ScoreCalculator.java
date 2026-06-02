package homework.week01;

public class ScoreCalculator {
	public static void main(String[] args) {
		int mathScore = 80;
		int engScore = 90;
		int totalScore = mathScore + engScore;
		int averageScore = totalScore / 2;

		System.out.println("--------transcript--------");
		System.out.println("數學：" + mathScore + "分");
		System.out.println("英語：" + engScore + "分");
		System.out.println("--------------------------");
		System.out.println("總分：" + totalScore + "分");
		System.out.println("平均：" + averageScore + "分");

	}
}
