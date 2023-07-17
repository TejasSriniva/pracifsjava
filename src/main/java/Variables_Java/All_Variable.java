package Variables_Java;

public class All_Variable {
    static String Name="Tejas";//Static variable
    static String City="Salem";
    int schoolmark=450;//Local variable
    int Age=17;//Instance Variable

    public void variable()
    {
        String name="local variable";
        String name1="global variable";
        String name2="inference variable";
        String name3="static variable";
        System.out.println("enter variable1:"+name);
        System.out.println("enter variable2:"+name1);
        System.out.println("enter variable3:"+name2);
        System.out.println("enter variable4:"+name3);
        System.out.println("enter Name:"+Name);
        System.out.println("enter City name:"+City);
        System.out.println("enter schoolmark:"+schoolmark);
        System.out.println("enter Age:"+Age);

    }









    public static void main(String[] args) {

        int a=1000;
        float b=1.501f;
        String Gender="Male";
        System.out.println("Enter the number:"+a);
        System.out.println("Enter the second number:"+b);
        System.out.println("Enter the string:"+Gender);

        All_Variable AV=new All_Variable();
                AV.variable();
    }

}
