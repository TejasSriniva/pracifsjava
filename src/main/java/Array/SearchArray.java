package Array;

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        String [] crushname={"Swetha","Saranya","Dharshini","dheeksha"};
        Scanner ss=new Scanner(System.in);

        System.out.println(crushname.length);
        System.out.println("tell us which is your girlfriend");
        String favour= ss.next();

        for (int pos=0;pos<crushname.length;pos++)
        {
            if(favour.equalsIgnoreCase(crushname[pos]))
            {
                System.out.println(favour+"Crush name");
                return;
            }
            else {
                System.out.println(favour+"Crush not found"  );
            }
        }
    }
}
