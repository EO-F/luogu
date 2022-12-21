import java.util.Scanner;

public class P5724 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            int a = scan.nextInt();
            max = max > a ? max : a;
            min = min < a ? min : a;
        }
        System.out.println(max - min);
    }
}
