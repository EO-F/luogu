import java.util.Scanner;

public class P1909 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < 3;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            sum = (int) ((Math.ceil(n * 1.0 / a)) * b);
            min = sum < min ? sum : min;
        }
        System.out.println(min);
    }
}
