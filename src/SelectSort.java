import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SelectSort {

    public static void main(String[] args) {
        // input data
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int[] arr = new int[l];
        for (int el = 0; el < arr.length; el++) {
            arr[el] = scanner.nextInt();
        }

        // implement algorithm

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length - 1; j++) {
                if(arr[i] > arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}