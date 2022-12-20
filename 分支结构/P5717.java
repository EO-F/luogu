import java.util.Arrays;
import java.util.Scanner;

public class P5717 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int[] arr = new int[]{a,b,c};
        Arrays.sort(arr);
        if(arr[1] + arr[0] <= arr[2]){
            System.out.println("Not triangle");
            System.exit(0);
        }
        if ((arr[1] * arr[1]) + (arr[0] * arr[0]) == (arr[2] * arr[2])){
            System.out.println("Right triangle");
        }
        if ((arr[1] * arr[1]) + (arr[0] * arr[0]) > (arr[2] * arr[2])) {
            System.out.println("Acute triangle");
        }
        if ((arr[1] * arr[1]) + (arr[0] * arr[0]) < (arr[2] * arr[2])) {
            System.out.println("Obtuse triangle");
        }
        if (arr[1] == arr[0]) {
            System.out.println("Isosceles triangle");
        }
        if (arr[1] == arr[2]) {
            System.out.println("Equilateral triangle");
        }
    }
}
