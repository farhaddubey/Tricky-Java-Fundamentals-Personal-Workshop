
public class recursion{
    public static int sum(int n){
       if(n!=-10){
        System.out.println(n);
        return n+ sum(n-1);
       }else{
        return 0;
       }
    }
    public static void main(String[] args){
        int result = sum(10);
        System.out.println(result);
    }
}