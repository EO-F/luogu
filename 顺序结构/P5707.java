import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class P5707 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int s = scan.nextInt();
//        int v = scan.nextInt();
//
//        int walkT = (int) Math.ceil(s * 1.0 / v);
//        int otherT = 10;
//        int aimT = 8;
//
//        int count = 1;
//        int sum = walkT + otherT;
//        while(sum > 60){
//            sum -= 60;
//            count++;
//        }
//
//        String hour = aimT - count < 0 ? (24 + (aimT - count))  + "": "0" + (aimT - count);
//        String m = 60 - sum >= 10 ? (60 - sum) + "" : "0" + (60 - sum);
//        System.out.println(hour + ":" + m);
//
//        //问题一，49 1 无法通过，结果为06:60 解决：while(sum >= 60) 去掉等于号
//        //问题二：整数相乘向上取整
//        //问题三：输入450 1，结果为24：xx，aimT - count <= 0 去掉等于号即可
//    }

//    //学习别人思路1
//    public static void main(String[] args) throws ParseException {
//        Scanner scan = new Scanner(System.in);
//        while(true){
//            int s = scan.nextInt();
//            int v = scan.nextInt();
//            double t = (double) s / v;
//            if(s >= 1 && v <= 10000){
//                String kaishi = "08:00";
//                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
//                Date date = sdf.parse(kaishi);
//                System.out.println(date.getTime());
//                double time =  date.getTime() - (t + 10)*60*1000;
//                System.out.println(sdf.format(time));
//                break;
//            }else {
//                System.out.println("你输入的s,v不符合条件,请您重新输入");}
//            }
//        }

        //学习别人思路2
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int s = scanner.nextInt();
                int y = scanner.nextInt();
                Calendar date = Calendar.getInstance();
                date.set(2021, Calendar.MAY, 5, 8, 0, 0);
                date.add(Calendar.MINUTE, -10);
                date.add(Calendar.MINUTE, s % y == 0 ? -(s / y) : -(s / y) - 1);
                SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                System.out.println(format.format(date.getTime()));
        }
}
