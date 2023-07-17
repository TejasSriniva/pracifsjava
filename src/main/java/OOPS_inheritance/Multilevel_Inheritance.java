package OOPS_inheritance;
class college
{
    public void courseoffered()
    {
        System.out.println("Arts and Science and engineering" );

    }
}
    class EStudents extends college
    {
        public void degree()
        {
            String cname="M.tech CSE";
            System.out.println("Tejas Degree"+cname);
        }
    }
    class AStudents extends EStudents
    {

        public void Degree() {
            String Cname1="Bsc.CS";
            System.out.println("Yusuf Degree"+Cname1);

        }

    }
public class Multilevel_Inheritance {

    public static void main(String[] args) {
        AStudents AA=new AStudents();
                AA.degree();
                AA.degree();
                AA.courseoffered();

    }

}
