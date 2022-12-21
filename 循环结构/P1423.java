import java.util.Scanner;

public class P1423 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double s = scan.nextDouble();
        double sum = 0;
        int step = 0;
        double n = 2;
        while(sum < s){
            step++;
            sum += n;
            n *= 0.98;
        }
        System.out.println(step);
    }
}
