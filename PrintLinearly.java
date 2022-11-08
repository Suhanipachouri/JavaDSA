import java.util.Scanner;
//Recursion

public class PrintLinearly {
    static void linearly(int i,int a) {
        if (i>a)
            return;
        System.out.println(i);
        linearly(i+1,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        linearly(0,a);
    }
}
