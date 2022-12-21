import java.util.Scanner;

public class P1420 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = -2;
        int len = 1;
        int res = 1;
        for(int i = 0;i < n;i++){
            int a = scan.nextInt();
            if(a == temp + 1){
                len++;
            }else {
                len = 1;
            }
            res = Math.max(len,res);
            temp = a;
        }
        System.out.println(res);
    }

    //TODO 一开始将res的判断加入了else中，会导致若是最后一个仍在++len的话，无法执行对结果的变化，故需要每次都进行一次结果的更新
    /**
     *            if(a == temp + 1){
     *                 len++;
     *             }else {
     *                 len = 1;
     *             }
     *             res = Math.max(len,res);
     *
     *
     *   之前
     *             if(a == temp + 1){
     *                 len++;
     *             }else {
     *                 len = 1;
     *                 res = Math.max(len,res);
     *             }
     */
}
