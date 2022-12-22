import java.util.Scanner;

public class P1047 {

    //TODO 线段树实现

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[l + 1];
        for(int i = 0;i < m;i++){
            int u = scan.nextInt();
            int v = scan.nextInt();

            for(int j = u;j <= v;j++){
                arr[j] = 1;
            }
        }
        int count = 0;
        for(int i = 0;i < l + 1;i++){
            if(arr[i] == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
