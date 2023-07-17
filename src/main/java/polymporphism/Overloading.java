package polymporphism;

public class Overloading {
    public void calculate(String name1, String name2) {
        if (name1 == name2) {
            System.out.println("The value is equal");
        } else {
            System.out.println("The value is not Equal");
        }
    }
    public int  calculate(int a,int b) {
        int c=a+b;
        System.out.println(c);
        return c;
    }
        public void calculate(Float ab,Float ba){
        double abc=ab+ba;
            System.out.println("the double value is"+abc);
        }

    public static void main(String[] args) {
        Overloading oo=new Overloading();
        oo.calculate(13,19);
        oo.calculate(5.9f,6.3f);
        oo.calculate("Tejas","tejas");

    }

}