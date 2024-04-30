public class TestingCom3 {
    public static void main(String[] args){
        String s1="Sachine";
        String s2="Sachine";
        String s3=new String("Sachine");
        System.out.println(s1==s2);
        System.out.println(s1==s3); ///False cause s3 belongs to another pool
        System.out.println(s1.equals(s3));
    }
    
}
