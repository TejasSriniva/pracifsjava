package ExceptionHandeling;

import java.util.Scanner;

public class Purpose {
    public static void main(String[] args) {
        String collect="I am Tejas,Studying in VIT";
        Scanner scan=new Scanner(System.in);
        try//condition block
        {
            System.out.println("Please tell us the index you want");
            System.out.println(collect.charAt(scan.nextInt()));
        }
        catch (StringIndexOutOfBoundsException str){
            System.out.println(str);
            System.out.println("index number should be less than"+collect.length());
            System.out.println(collect.charAt(scan.nextInt()));
        }
        finally {
            System.out.println("End of the code c" +collect);
        }
    }
}
