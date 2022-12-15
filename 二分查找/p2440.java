import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class p2440 {
    public static void main(String[] args) throws Exception {
        Read read = new Read();
        int n = read.nextInt();
        int k = read.nextInt();
        //左端点=0，就会出现/0的情况，应该把左端点的初值改成1
        long l = 1;
        long r = Integer.MIN_VALUE;
        long[] arr = new long[n];
        for(int i =0 ;i < n;i++){
            arr[i] = read.nextLong();
            r = Math.max(r,arr[i]);
        }
        while(l <= r){
            long mid = l + (r - l)/2;
            if(judge(k,arr,mid)){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        System.out.println(l - 1);
    }

    private static boolean judge(int k, long[] arr, long mid) {
        int n = 0;
        for(int i = 0;i < arr.length;i++){
            n += arr[i] / mid;
        }
        if(n >= k){
            return true;
        }
        return false;
    }

    static class Read {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        public long nextLong() throws Exception {
            st.nextToken();
            return (long) st.nval;
        }
        public int nextInt() throws Exception {
            st.nextToken();
            return (int) st.nval;
        }
    }
}
