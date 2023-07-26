package Array;

import java.util.Arrays;

public class PassingArray {
    public void passingArray(double[]salary1){
        salary1[3]=12201.1;
        salary1[1]=19999.01;
        System.out.println(Arrays.toString(salary1));
    }
     public void PassingArray1(String name1)
     {
         System.out.println("Welcome");
     }

    public static void main(String[] args) {
        int a=100;
        String name="Tejas";
        double[] salary={12,2,5,4.3,4.9};
        PassingArray pp=new PassingArray();
        pp.passingArray(salary);
        pp.PassingArray1("Tejas");
        System.out.println(name);
    }

}
