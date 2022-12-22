import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P5727 {
    static List<Integer> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int turn = turn(n);
        Collections.reverse(arr);
        for(int i = 0;i < arr.size();i++){
            if(i == arr.size() - 1){
                System.out.printf("%d",arr.get(i));
            }else {
                System.out.printf("%d" + " ",arr.get(i));
            }
        }
    }

    public static int turn(int n){
        arr.add(n);
        if(n == 1){
            return 1;
        }
        if(n % 2 == 0){
            n /= 2;
        }else {
            n = n * 3 + 1;
        }
        return turn(n);
    }
}
