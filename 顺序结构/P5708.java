import java.util.Scanner;

public class P5708 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double p = 0.5 * (a + b + c);

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("%.1f",area);
    }
}
