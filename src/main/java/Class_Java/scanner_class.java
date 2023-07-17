package Class_Java;

import java.util.Scanner;

public class scanner_class
{
    public static void main(String[] args)
    {


        String School="Holy Cross";
        System.out.println(School);
        Scanner sss=new Scanner(System.in);


        System.out.println("enter your name");
        String name= sss.nextLine();
        System.out.println("your name is:"+name);

        System.out.println("Enter the age");
        int age= sss.nextInt();
        System.out.println("enter the age"+age);
        System.out.println("enter the phone number");
        long phonenumber= sss.nextLong();
        System.out.println("enter the phone number"+phonenumber);

        System.out.println("enter your height");
        int height= sss.nextInt();
        System.out.println("your height is"+height);


    }

}
