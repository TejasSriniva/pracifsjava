package Controlstatements_java;

import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your age");
        int age= scan.nextInt();
        if(age>18 && age<14)
        {
            System.out.println("your are a 90's kid");

            if(age>24 && age<27)
            {
                System.out.println("you are a 2k kid");
            }
            else
            {
                System.out.println("Unfortunately You are not lucky ");
            }
        }
        else {
            System.out.println(" You are lucky ");
        }
    }
}
