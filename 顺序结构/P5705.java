import java.util.Scanner;

public class P5705 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        char[] next = scan.next().toCharArray();
        //1.开始的思路
//        int i = 0,j = next.length - 1;
//        while(i < j){
//             char temp = next[i];
//             next[i] = next[j];
//             next[j] = temp;
//             i++;
//             j--;
//        }

//        //2.后面的思路
//        String sum = "";
//        for(int i = next.length - 1;i >= 0;i--){
//            sum += next[i];
//        }

        String next = scan.next();
        //3.调用api进行反转
        StringBuilder sb = new StringBuilder(next);
        System.out.println(sb.reverse());
    }
}
