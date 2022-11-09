public class sumofnos {
    static int sum(int a){
        if(a==0){
            return 0;
        }
        return a +sum(a-1);
    }
    public static void main(String[] args) {
        int a = 10;
        int ans= sum(a);
        System.out.println(ans);
    }
}
