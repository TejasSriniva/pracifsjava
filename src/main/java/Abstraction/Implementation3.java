package Abstraction;

public class Implementation3 extends Implementation1 {
    @Override
    public void Additionmethord(int a, int b) {
        int c=a*b;
        System.out.println(c);
    }

    @Override
    public void ArithemeticOperator(int a, int b) {
            int c=a/b;
        System.out.println(c);
    }

    @Override
    public void additional(int a, int b) {
            int c=a%b;
    }
}
