import java.util.Scanner;

public class P5706 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float t = scan.nextFloat();
        float n = scan.nextFloat();

//        System.out.println(t / n);
//        System.out.println(n * 2);
        System.out.printf("%.3f\n",t/n);
        System.out.printf("%.0f",n * 2);
    }
}
