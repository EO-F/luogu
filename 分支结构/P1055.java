import java.util.Scanner;

public class P1055 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char[] arr = s.toCharArray();
        int sum = 0;
        int count = 1;
        for(int i = 0;i < arr.length - 1;i++){
            if(arr[i] >= '0'&& arr[i] <= '9'){
                sum += (arr[i] - '0') * count;
                count++;
            }
        }
        int res = sum % 11;
        char result = ' ';
        if(res == 10){
            result = 'X';
        }else {
            result = Character.forDigit(res,10);
        }
        if(result == arr[arr.length - 1]){
            System.out.println("Right");
        }else{
            //TODO 整型转换成字符型！！！！！！！！！！
            arr[arr.length - 1] = result;
            System.out.println(arr);
        }
    }
}
