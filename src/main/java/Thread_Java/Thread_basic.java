package Thread_Java;

public class Thread_basic {
    void add()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello there");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class bike1

{
    void add1()
    {
        for(int i=1;i<=5;i++)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
class
MultiThreading {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Thread_basic c = new Thread_basic();
        bike1 b = new bike1();
        c.add();
        b.add1();


    }
    }
