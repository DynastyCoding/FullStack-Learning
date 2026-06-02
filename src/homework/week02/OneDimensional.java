package homework.week02;

public class OneDimensional {

    public static void p01() {
        int[] arr = {10, 20, 50, 40, 50};
        System.out.println(arr[2]);
    }

    public static void p02() {

        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 30) {
                System.out.printf("30's index is %d.%n", i);
                break;
            }
        }
    }

    public static void p03() {

        int[] arr = {1, 2, 3, 4, 5};
        arr[1] = 99;
        for (int ar : arr) {
            System.out.println(ar);
        }
    }

    public static void p04() {

        int[] arr = {5, 10, 15, 20, 25, 30};
        System.out.printf("the length of the array is %d.%n", arr.length);
    }

    public static void p05() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        for(int ar:arr){
            System.out.println(ar);
        }
    }

    public static void p06(){

        int[] scores = {85,92,78,88,95};
        int sum=0;
        for(int i=0;i<scores.length;i++){
            sum += scores[i];
        }
        System.out.printf("scores sum is %d",sum);
    }

    public static void main(String[] args) {
        //p01();
        //p02();
        //p03();
        //p04();
        //p05();
        p06();
    }
}
