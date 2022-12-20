import java.util.Scanner;

public class P5711 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        boolean flag = false;
        if(year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)){
            flag = true;
        }
        System.out.println(flag == true ? 1 : 0);
    }
}
