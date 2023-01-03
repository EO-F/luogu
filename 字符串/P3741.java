import java.util.Scanner;

//TODO
public class P3741 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        char[] arr = scan.nextLine().toCharArray();
        int count = 0;
        for(int i = 0;i < arr.length - 1;i++){
            if(arr[i] == 'V' && arr[i + 1] == 'K'){
                count++;
                arr[i] = 'X';
                arr[i + 1] = 'X';
            }
        }
        for(int i = 0;i < arr.length - 1;i++){
            if(arr[i] == 'K' && arr[i + 1] == 'K'){
                count++;
                break;
            }
            if(arr[i] == 'V' && arr[i + 1] == 'V'){
                count++;
                break;
            }
        }
        System.out.println(count);
    }
}
