package debugpractice;

public class DebugPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [步驟 1] 在下面這一行 (line 6) 設定斷點 (Double Click / Ctrl+Shift+B)
				System.out.println("=== 除錯練習開始 ===");
				int num1 = 10;
				int num2 = 20;
				// [練習 F6 - Step Over]:按下 F6,程式會直接執行這行並跳到下一行,不會進入 println 內部

				System.out.println("準備進行計算...");
				// [練習 F5 - Step Into]:當綠色光標停在這行時,按下 F5 進入addNumbers 方法內部

				int sum = addNumbers(num1, num2);
				System.out.println("總和為: " + sum);
				// [練習 F8 - Resume]:迴圈測試
				for (int i = 1; i <= 5; i++) {
					// 在這裡設定另一個斷點。按下 F8 會直接跳到下一次迴圈的斷點處(不用按 F6 慢慢走)

					System.out.println("迴圈次數: " + i);
				}
				System.out.println("=== 程式結束 ===");
			}

			// 這是一個用來練習跳入 (Step Into) 和跳出 (Step Return) 的方法
			public static int addNumbers(int a, int b) {
				int result = a + b;
				// [練習 F7 - Step Return]:進來這裡後,若不想一行行看完,按 F7 可以直接執行完此方法並返回 main 方法
				displayDetails(a, b);
				return result;
			}

			public static void displayDetails(int a, int b) {
				System.out.println("正在計算 " + a + " + " + b);
				}
		}
