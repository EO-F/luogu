import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int res = 0;
        int sum = 0;
        for (int i = 1; i < 8; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            sum = n + m;
            if (sum > max && sum > 8) {
                max = sum;
                res = i;
            }
        }
        System.out.println(res);
    }
}
