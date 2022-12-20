import java.util.Scanner;

public class p5710 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int n = scan.nextInt();
        if(n % 2 == 0){
            count++;
        }
        if(n >= 4 && n <= 12){
            count++;
        }
        String res = "";
        if(count == 2){
            res += "1 ";
        }else{
            res += "0 ";
        }

        if(count >= 1){
            res += "1 ";
        }else {
            res += "0 ";
        }

        if(count == 1){
            res += "1 ";
        }else {
            res += "0 ";
        }

        if(count == 0){
            res += "1 ";
        }else {
            res += "0 ";
        }

        System.out.println(res);
    }
}
