package ExceptionHandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        int clock=0;
        int block=0;
        try {
            System.out.println("Enter the first number");
            clock= ss.nextInt();
            System.out.println("Enter the second number");
            block= ss.nextInt();
            System.out.println(clock/block);
        }
        catch (ArithmeticException exe)
        {
            System.out.println("Can't be used by zero");
            block= ss.nextInt();
            System.out.println(clock/block);
        }
        catch (InputMismatchException exe1)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Use onlynumeric numbers");
            clock= s.nextInt();
            block= s.nextInt();
            System.out.println(clock/block);
        }
    }
}
