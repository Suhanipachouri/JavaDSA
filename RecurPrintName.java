import java.util.Scanner;

public class PrintName {
    int i =0;
    static void print(int i,int a) {
        if(i==a)
            return;
        System.out.println("Suhani");
        print(i+1,a);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        print(0,a);
    }
}
