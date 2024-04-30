public class strconcat1 {
    public static void main(String[] args){
        String s = "Sachin" + "Tendulkar";
        System.out.println(s);
        String s1= 50+30+20+"Farhad Dubey"+100+90;
        System.out.println(s1);
        String s2="Sachin";
        String s3=new String("Tendulker");
        String s4=s2.concat(s3);
        System.out.println(s4);

        StringBuilder s5= new StringBuilder("Hello");
        StringBuilder s6= new StringBuilder("World");
        StringBuilder s7=s5.append(s6);
        System.out.println(s7);

        String s8=String.format("%s%s",s5,s6);
        System.out.println(s8);
    }
    
}
