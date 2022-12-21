import java.util.Scanner;

public class P1980 {
    static int[] arr = new int[10];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            getCount(i);
        }
        System.out.println(arr[x]);
    }
    public static void getCount(int n){
        while(n != 0){
            int a = n % 10;
            arr[a]++;
            n /= 10;
        }
    }
}
