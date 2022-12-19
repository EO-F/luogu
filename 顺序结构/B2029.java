import java.util.Scanner;

public class B2029 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int r = scan.nextInt();
        double area = Math.PI * r * r;
        double sumA = area * h;

        int total = (int) Math.ceil((20*1000* 1.0) / sumA);
        System.out.println(total);
    }
}
