package String_Java;

public class Code_String2 {
    public static void main(String[] args) {
        String a="Tejas";
        String a1="Tejas";
        String a2=new String("Tejas");
        String a3="Swetha";
        System.out.println(a.equals(a1));
        System.out.println(a2.equals(a1));
        System.out.println(a.equalsIgnoreCase(a1));
        System.out.println(a==a1);
        System.out.println(a.compareTo(a1));
    }
}
