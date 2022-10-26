import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class p2249 {
    public static void main(String[] args) throws Exception {
        Read scan = new Read();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0;i < m;i++){
            int target = scan.nextInt();
            int left = 0,right = n - 1;
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(arr[mid] < target){
                    left = mid + 1;
                }else if(arr[mid] > target){
                    right = mid - 1;
                }else if(arr[mid] == target){
                    right = mid - 1;
                }
            }
            if(left >= arr.length || arr[left] != target){
                System.out.print(-1 + " ");
            }else{
                System.out.print(left + 1 + " ");
            }
        }
    }

    static class Read {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        public int nextInt() throws Exception {
            st.nextToken();
            return (int) st.nval;
        }
    }
}
