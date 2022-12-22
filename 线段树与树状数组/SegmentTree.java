import java.io.*;

public class SegmentTree<E>{
    private E[] data;
    private E[] tree;

    private Merger<E> merger;//融合器

    public SegmentTree(E[] arr){
        data = (E[]) new Object[arr.length];
        for(int i = 0;i < arr.length;++i)
            data[i] = arr[i];
        //最大即区间长度的四倍就可以存储所有元素
        tree = (E[]) new Object[arr.length * 4];
        buildSegmentTree(0,0,data.length - 1);//treeIndex, l ,r
    }

    public int getSize(){
        return data.length;
    }

    public E get(int index){
        if(index < 0 || index >= data.length)
            throw new IllegalArgumentException("Index is illegal");
        return data[index];
    }

    //返回完全二叉树的数组表示中，一个索引所表示的左子节点的索引
    private int leftChild(int index){
        return 2 * index + 1;
    }

    //返回一个索引所表示的右子节点的索引
    private int rightChild(int index){
        return 2 * index + 2;
    }

    public interface Merger<E>{
        E merge(E a,E b);//将两个E转换为一个E返回去
    }

    private void buildSegmentTree(int treeIndex, int l, int r) {
        //只有一个元素时，创建叶子结点
        if(l == r){
            tree[treeIndex] = data[l];
            return;
        }
        int leftTreeIndex = leftChild(treeIndex);
        int rightTreeIndex = rightChild(treeIndex);
        int mid = l + (r - l) / 2;
        //构建两颗子树
        buildSegmentTree(leftTreeIndex,l,mid);
        buildSegmentTree(rightTreeIndex,mid + 1,r);
        //区间和就是用+；最大值最小值就是max，min
        //问题额E上面不一定定义了假发；同时，我们希望用户根据业务场景逻辑使用线段树
        tree[treeIndex] = merger.merge(tree[leftTreeIndex],tree[rightTreeIndex]);
    }

   public E query(int queryL,int queryR){
        if(queryL < 0 || queryL >= data.length || queryR < 0 || queryR >= data.length){
            throw new IllegalArgumentException("Index is illegal");
        }
        //treeIndex,l,r,queryL,queryR
       return query(0,0,data.length - 1,queryL,queryR);
   }

    private E query(int treeIndex, int l, int r, int queryL, int queryR) {
        if(l == queryL && r == queryR){
            return tree[treeIndex];
        }
        int mid = l + (r - l) / 2;
        int leftTreeIndex = leftChild(treeIndex);
        int rightTreeIndex = rightChild(treeIndex);
        if(queryL >= mid + 1){
            return query(rightTreeIndex,mid + 1,r,queryL,queryR);
        } else if (queryR <= mid) {
            return query(leftTreeIndex,l,mid,queryL,queryR);
        }

        E leftResult = query(leftTreeIndex,l,mid,queryL,mid);
        E rightResult = query(rightTreeIndex,mid + 1,r,mid + 1,queryR);

        return merger.merge(leftResult,rightResult);
    }

    public void set(int index,E e){
        if(index < 0 || index >= data.length){
            throw new IllegalArgumentException("Index is illegal");
        }
        data[index] = e;
        //treeIndex, l , r,index ,e
        set(0,0,data.length - 1,index,e);
    }

    private void set(int treeIndex, int l, int r, int index, E e) {
        //直接修改叶子结点上元素的值
        if(l == r){
            tree[treeIndex] = e;
            return;
        }
        int mid = l + (r - l) / 2;
        int leftTreeIndex = leftChild(treeIndex);
        int rightTreeIndex = rightChild(treeIndex);
        if(index > mid + 1){
            set(rightTreeIndex,mid + 1,r,index,e);
        }else{
            set(leftTreeIndex,l,mid,index,e);
        }
        //从底往上更新线段树
        tree[treeIndex] = merger.merge(tree[leftTreeIndex],tree[rightTreeIndex]);
    }

    public static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    public static String next() throws IOException {
        in.nextToken();
        return (String) in.sval;
    }

    public static double nextDouble() throws IOException {
        in.nextToken();
        return in.nval;
    }

    public static float nextFloat() throws IOException {
        in.nextToken();
        return (float) in.nval;
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int m = nextInt();
        long[] arr = new long[n];
        for(int i = 0;i < n;i++){
            arr[i] = nextInt();
        }

        for(int i = 0;i < m;i++){

        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0;i < tree.length;++i){
            if(tree[i] != null){
                sb.append(tree[i]);
            }else {
                sb.append("null");
            }
            if(i != tree.length - 1)
                sb.append(' ');
        }
        return sb.toString();
    }
}


