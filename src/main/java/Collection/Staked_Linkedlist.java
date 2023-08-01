package Collection;

import java.util.Stack;

public class Staked_Linkedlist {
    public static void main(String[] args) {
        // Stack-List In first out
        //push()-Add
        //pop()-Delete last element
        //Empty()=Returns true value if nothing is one the top of the stack(elsereturn False)
        //peek()-return top of the element in stack
        //search()-Returns the position of element(or else return -1)

        Stack lifo=new Stack();
        Stack<String> lifo1=new Stack<String>();
        lifo.push("Tejas");
        lifo.push(98989898);
        lifo.push(80);
        lifo.push("Tan");

        System.out.println(lifo+"Before delleted values");
        lifo.pop();
        System.out.println(lifo);

        if(lifo1.empty()==true)
        {
            System.out.println("The value is empty");
        }
        else {
            System.out.println("Your value is empty");
        }

        //linked list-duplicate allowed,Maintained insertion order,syncronised not supported,Manipulation is fast,Prerormance with index number

        //add/addlast , addFirst ,add(index,Object) ,remove/remove
        
    }
}
