import java.util.Arrays;
import java.util.Scanner;

public class P1888 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int[] arr = new int[]{a,b,c};
        Arrays.sort(arr);

        int res = gcd(arr[0],arr[2]);
        //TODO 要约分！！！！！！！
        System.out.println(arr[0] / res + "/" + arr[2] / res);

    }

    public static int gcd(int a,int b){
        return b > 0 ? gcd(b,a%b) : a;
    }
}
