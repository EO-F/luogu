import java.util.Scanner;

public class P5718 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            int m = scan.nextInt();
            min = Math.min(min,m);
        }
        System.out.println(min);
    }
}
