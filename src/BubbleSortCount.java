import java.util.Scanner;

public class BubbleSortCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int[] arr = new int[l];

        for (int el = 0; el < arr.length; el++) {
            arr[el] = scanner.nextInt();
        }

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    res += 1;
                }

            }
        }
        System.out.println(res);
    }
}
