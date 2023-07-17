package Assingment_Java;

import Orginaljava.Main;

import java.util.Scanner;

public class Assingment_switch
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number 1 to 12");
        int month= scan.nextInt();
        String Monthofyear;

        switch (month)
        {
            case 1:
                Monthofyear="January";
                break;
            case 2:
                Monthofyear="February";
                break;
            case 3:
                Monthofyear="March";
                break;
            case 4:
                Monthofyear="April";
                break;
            case 5:
                Monthofyear="May";
                break;
            case 6:
                Monthofyear="June";
                break;
            case 7:
                Monthofyear="July";
                break;
            case 8:
                Monthofyear="August";
                break;
            case 9:
                Monthofyear="September";
                break;
            case 10:
                Monthofyear="October";
                break;
            case 11:
                Monthofyear="November";
                break;
            case 12:
                Monthofyear="December";
                break;
            default:
                Monthofyear="Invalid Month";
                break;
        }
        System.out.println("The month in the year is "+Monthofyear);
    }
}
