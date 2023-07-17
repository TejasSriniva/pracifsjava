package Typecasting_Java;

public class Casting {
    public static void main(String[] args) {
        char veramari = 'T';

        int myasscinum = veramari;
        System.out.println("mari is" + veramari + "convert a value in asscinumber is :" + myasscinum);


        //narrowing largest datatpe-Smallest data type


        double myweight = 75.50;

        int mywholeweight = (int) myweight;
        System.out.println(mywholeweight);


        int mynum = 66;

        char value = (char) mywholeweight;
        System.out.println("My number is:" + mynum + " is converted to assci value is:" + value);

        int value1 = 100;
        System.out.println("The integer value is:" + value1);
        double num1 = 10.08;
        System.out.println("the double value :" + num1);

        int data1 = (int) num1;
        System.out.println("the data value is" + data1);
    }
}