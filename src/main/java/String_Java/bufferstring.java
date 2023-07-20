package String_Java;

public class bufferstring {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Tejas");

        s.append("Srinivasan");
        System.out.println(s);

        s.insert(9,"Tej");
        System.out.println(s);

        s.replace(1,3,"as");
        System.out.println(s);
        s.delete(1,2);
    }
}
