import java.util.Arrays;
import java.util.Scanner;

public class P5726 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            int a = scan.nextInt();
            arr[i] = a;
        }
        Arrays.sort(arr);
        double sum = 0;
        for (int i = 1;i < arr.length - 1;i++){
            sum += arr[i];
        }
        System.out.printf("%.2f",sum / (n - 2));
    }
}
