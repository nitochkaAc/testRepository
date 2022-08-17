import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n  =100;
        long[] mas = new long[n+1];
        Arrays.fill(mas, -1);
        System.out.println(fNumber(n, mas));
    }

    private static long fNumber(int n, long[]mem) {
        if(mem[n]!=-1)
            return mem[n];
        if (n <= 1) {
            return n;
        }
           long result =  fNumber(n - 1, mem) + fNumber(n - 2, mem);
        mem[n] = result;
        return mem[n];
    }
    private static long fEffNumber(int n){
        long[] arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i<=n; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

}
