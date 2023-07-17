package Looping_java;

import java.util.Scanner;

public class DEMOdowhile_JAVA {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int staff=0;
        float time=0;
        int count=0;

        do{
            System.out.println("Staff enter login time");
            time=scan.nextFloat();
            if(time>9.15)
            {
                System.out.println("your entry is late so your salery is reduaed by 5%");
                count++;
            }
            else {
                System.out.println("you are at right time keep it up");
            }
            staff++;
        }
        while (staff>0);
        System.out.println("This Month late commer count is"+count);
    }
}
