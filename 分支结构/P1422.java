import java.util.Scanner;

public class P1422 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        if(n <= 150){
            System.out.printf("%.1f",n * 0.4463);
        } else if (n > 150 && n <= 400) {
            double sum = (n - 150) * 0.4663 + (150 * 0.4463);
            System.out.printf("%.1f",sum);
        }else{
            double sum = (n - 400) * 0.5663 + (250 * 0.4663) + (150 * 0.4463);
            System.out.printf("%.1f",sum);
        }
    }
}
