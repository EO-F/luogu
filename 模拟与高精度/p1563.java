import java.io.BufferedInputStream;
import java.util.Scanner;

public class p1563 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        int n = scan.nextInt();
        int m = scan.nextInt();
        person[] person = new person[n];
        for(int i = 0;i < n;i++){
            int temp = scan.nextInt();
            String str = scan.next();
            person[i] = new person(temp,str);
        }
        int ji = 0;
        for(int i = 0;i < m;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(person[ji].chaoxiang == 0 && a == 0){
                ji -=b;
            } else if (person[ji].chaoxiang == 0 && a == 1) {
                ji +=b;
            } else if (person[ji].chaoxiang == 1 && a == 0) {
                ji +=b;
            } else if (person[ji].chaoxiang == 1 && a == 1) {
                ji -=b;
            }
            while(ji < 0 || ji >= n){
                if(ji < 0){
                    ji += n;
                }
                if(ji >= n){
                    ji -= n;
                }
            }
        }
        System.out.println(person[ji].name);
    }
    public static class person{
        int chaoxiang;
        String name;

        public person(int chaoxiang, String name) {
            this.chaoxiang = chaoxiang;
            this.name = name;
        }

        public int getChaoxiang() {
            return chaoxiang;
        }

        public void setChaoxiang(int chaoxiang) {
            this.chaoxiang = chaoxiang;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
