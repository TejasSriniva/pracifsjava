package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Update {
    public static void main(String[] args) {
        String [] friends={"Susanth","Dinesh","Yusuf","Swetha"};
        System.out.println("Before updating values");
        System.out.println(Arrays.toString(friends));

        Scanner ss=new Scanner(System.in);

        System.out.println("Which position is to be updated");
        int pos= ss.nextInt();
        System.out.println("What to replace");
        String name=ss.next();

        friends[pos]=name;

        System.out.println("After updating values");
        System.out.println(Arrays.toString(friends));
    }
}
