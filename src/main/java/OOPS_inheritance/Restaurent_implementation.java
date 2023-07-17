package OOPS_inheritance;

public class Restaurent_implementation extends Food implements Breakfast,Lunch,DInner{
    public static void main(String[] args) {
        Food ff=new Food();
        ff.Allfood();
        ff.breakfast();
        ff.lunch();
        ff.DInner();

    }
    @Override
    public void breakfast() {
        System.out.println("Breakfast dine in is Rs.500");

    }

    @Override
    public void Dinner() {
        System.out.println("dinner dine in is Rs.1000");

    }

    @Override
    public void Lunch() {
        System.out.println("Lunch dine in is Rs.800");

    }
}
