import java.util.Scanner;
public class PrintNto1 {
    static void linearly(int i,int a) {
        if (i<=0)
            return;
        System.out.println(i);
        linearly(i-1,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        linearly(a,0);
    }
}

