public class TestMutableString {
    public static void main(String[] args){
        String s="Sachin";
        s.concat("Tandulkar");
        System.out.println(s);
        // But if we explicitly assign, then it will provide us the Entire Name. 
        String sf=s.concat("Tendulkar");
        System.out.println(sf);
    }
    
}
