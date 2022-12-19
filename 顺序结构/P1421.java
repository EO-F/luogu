import java.util.Scanner;

public class P1421 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum = (int) ((a + b * 0.1) / 1.9);
//        double sum1 = ((a + b * 0.1) / 1.9);
        System.out.println(sum);

//        //会四舍五入的，不行
//        System.out.printf("%.0f",sum1);
    }
}
