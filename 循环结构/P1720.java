import java.util.Scanner;

public class P1720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double fn = Math.pow((1 + Math.sqrt(5)) / 2,n) - Math.pow((1 - Math.sqrt(5)) / 2,n) ;
        fn = fn / Math.sqrt(5);
        System.out.printf("%.2f",fn);
    }
}
