import java.util.ArrayList;
import java.util.Scanner;

public class P5723 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 2;sum < L;i++){
            if(isPrime(i)){
                if(sum + i > L){
                    break;
                }
                list.add(i);
                sum += i;
            }
        }
        for(int n : list){
            System.out.println(n);
        }
        System.out.println(list.size());
    }
    public static boolean isPrime(int n){
        for(int i = 2;i * i <= n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
