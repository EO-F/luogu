import java.util.Scanner;

public class P1424 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int n = scan.nextInt();
        int sum = 0;
        while (n != 0){
            switch (w){
                case 1:
                    sum += 250;
                    break;
                case 2:
                    sum += 250;
                    break;
                case 3:
                    sum += 250;
                    break;
                case 4:
                    sum += 250;
                    break;
                case 5:
                    sum += 250;
                    break;
            }
            w++;
            if(w > 7){
                w -= 7;
            }
            n--;
        }
        System.out.println(sum);
    }
}
