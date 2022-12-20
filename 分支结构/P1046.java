import java.util.Scanner;

public class P1046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0;i < 10;i++){
            arr[i] = scan.nextInt();
        }
        int h = scan.nextInt();
        int count= 0;
        for(int apple : arr){
            if(h + 30 >= apple){
                count++;
            }
        }
        System.out.println(count);
    }
}
