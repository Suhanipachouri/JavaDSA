import java.util.Scanner;
//ThroughRecursion
public class BacktrackNto1 {
    static void backtrack(int i,int n){
        if(i>n){
            return;
        }
        backtrack(i+1,n);
        System.out.println(i);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        backtrack(0,N);
    }
}
