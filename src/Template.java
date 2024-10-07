import java.util.Scanner;

public class Template {

    public static void main(String[] args) {
        // input data
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int[] arr = new int[l];

        for (int el = 0; el < arr.length; el++) {
            arr[el] = scanner.nextInt();
        }

        // implement algorithm
        int res = 0;
        System.out.println(res);
    }
}
