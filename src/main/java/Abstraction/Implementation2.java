package Abstraction;

public class Implementation2 extends Implementation1 {

    @Override
    public void Additionmethord(int a, int b) {
        super.Additionmethord(a, b);
    }

    @Override
    public void ArithemeticOperator(int a, int b) {

    }

    @Override
    public void additional(int a, int b) {

    }

    public static void main(String[] args) {
      Implementation2 ii=new Implementation2();
      ii.Additionmethord(55,55);
      ii.ArithemeticOperator(66,66);

    }



}
