package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        int[] arr=new int[10];

        arr[5]=1090;
        arr[7]=1253;
        System.out.println(Arrays.toString(arr));

        Scanner ss=new Scanner(System.in);

        for (int i=0;i<arr.length;i+=1)
        {
            System.out.println("Enter one digit number");
            arr[i]=ss.nextInt();
        }
        for(int teja:arr)
        {
            System.out.println(teja);
        }
    }
}
