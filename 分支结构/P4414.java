import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P4414 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int[] arr = new int[]{a,b,c};
        Arrays.sort(arr);
        String next = scan.next();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < next.length();i++){
            switch (next.charAt(i)){
                case 'A':
                    list.add(arr[0]);
                    break;
                case 'B':
                    list.add(arr[1]);
                    break;
                case 'C':
                    list.add(arr[2]);
                    break;
            }
        }
        String res = "";
        for(int i = 0;i < list.size();i++){
            if(i == list.size() - 1){
                res += list.get(i);
            }else {
                res += list.get(i) + " ";
            }
        }
        System.out.println(res);
    }
}
