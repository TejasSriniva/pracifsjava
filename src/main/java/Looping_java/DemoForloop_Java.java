package Looping_java;

import java.util.Scanner;

public class DemoForloop_Java {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        for (int myreqirment=10;myreqirment>0;)
        {
            System.out.println("what is your experience");
            float experience= scan.nextFloat();
            if(experience>=4 && experience<=10)
            {
                System.out.println("you are hired"+myreqirment);
                myreqirment--;
            }

           else {
            System.out.println("you are rejected");
        }
        }
    }

}
