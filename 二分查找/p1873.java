import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class p1873 {
    public static void main(String[] args) throws Exception {
        Read read = new Read();
        int n = read.nextInt();
        int m = read.nextInt();
        int[] arr = new int[n];
        int l = 0,r = 0;
        for(int i = 0;i < n;i++){
            arr[i] = read.nextInt();
            r = Math.max(r,arr[i]);
        }
        while (l <= r){
            int mid = l + (r - l)/2;
            if(judge(mid,arr,m)){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        System.out.println(l - 1);
    }
    public static boolean judge(int mid,int[] s,int m) {
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] > mid) {
                sum += (s[i] - mid);
                if (sum >= m) {
                    return true;
                }
            }
        }
        return false;
    }
    static class Read {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        public int nextInt() throws Exception {
            st.nextToken();
            return (int) st.nval;
        }
    }
}
