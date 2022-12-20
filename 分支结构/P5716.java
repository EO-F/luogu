import java.util.Scanner;

public class P5716 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(y % 4 == 0 && y % 100 != 0 || (y % 400 == 0)){
            arr[2] = 29;
        }
        System.out.println(arr[m]);
    }
}
