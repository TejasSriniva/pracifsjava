package Collection;

import java.util.ArrayList;
import java.util.Vector;

public class Vector_Array {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.add("VIT");
        list.add(32);
        list.add(6.5);
        list.add(1234567890);
        list.add('a');

        System.out.println(list);

        Vector list1=new Vector();

        list1.addAll(list);
        list1.add("Savary");
        list1.add(123455678997l);

        System.out.println("My arraylist Value"+list);
        System.out.println("Arraylist remove orjinal value"+list1);


        list1.removeAll(list);
        System.out.println(list1);

        list1.retainAll(list);
        System.out.println(list1);
    }
}
