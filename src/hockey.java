import java.util.Scanner;

public class hockey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        long res = factorial(l) / factorial(l - 3);
        System.out.println(res);
    }

    public static long factorial(long l) {
        long N = 1;
        for(long j = 1; j <= l; j++) {
            N = N * j;
        }
        return N;
    }


}
