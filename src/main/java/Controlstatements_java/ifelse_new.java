package Controlstatements_java;

import java.util.Scanner;

public class ifelse_new
{
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the character name");
        String cname= ss.next();
        if(cname.equalsIgnoreCase("raj"))
        {
            System.out.println("you are weak");
        }else
        {
            System.out.println("you are not weak+");
        }
    }
}

