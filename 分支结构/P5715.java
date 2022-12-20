import java.util.Arrays;
import java.util.Scanner;

public class P5715 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}
