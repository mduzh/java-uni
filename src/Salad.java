import java.util.Scanner;

public class Salad {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextInt();

        long total = 0;
        for(long j = 2; j < num + 1; j++) {
            long result = factorial(num) / (factorial(num - j) * factorial(j));
            total += result;
        }
        System.out.println(total);
    }

    public static long factorial(long num) {
        long res = 1;
        for(long i = 1; i < num + 1; i++) {
            res = res * i;
        }
        return res;
    }
}
