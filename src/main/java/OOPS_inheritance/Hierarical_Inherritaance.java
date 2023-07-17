package OOPS_inheritance;
class father
{
    String fname="yuvaraj";
    public void Mother(){
        String Mname="Sarasvathi";
        System.out.println("Mother Name is:"+Mname);
        System.out.println("Father name is :"+fname);
    }
}
    class Son extends father
    {
            public void Son()
            {
                String Sname="Ravi";
                System.out.println("Brother Name is:"+Sname);
            }

    }
    class Mano extends father
    {
        public void Lname()
        {
            String Lname="Meena";
            System.out.println("Mano wife Name is:"+Lname);
        }
    }
public class Hierarical_Inherritaance {
    public static void main(String[] args) {
       Mano nn=new Mano();
        nn.Lname();
        nn.Mother();
        Son bb=new Son();
        bb.Son();
    }
}
