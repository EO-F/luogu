import java.util.Scanner;

public class P5712 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eat = scan.nextInt();
        if(eat <= 1){
            System.out.printf("Today, I ate %d apple.",eat);
        }else {
            System.out.printf("Today, I ate %d apples.",eat);
        }
    }
}
