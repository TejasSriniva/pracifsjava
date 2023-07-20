package String_Java;

public class String3 {
    public static void main(String[] args) {
        String a="ANNAMALAI";
        System.out.println(a.startsWith("a"));
        System.out.println(a.endsWith("I"));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(3));
        System.out.println(a.length());
        String s="nothing morre than happyness.face happy";
        String replace=s.replace("happy","sad");
        System.out.println(replace);
        String S="Yusuf love Swetha";
        String S1=S.replace("Yusuf","Tejas");
        System.out.println(S1);
    }
}
