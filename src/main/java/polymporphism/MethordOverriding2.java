package polymporphism;

public class MethordOverriding2 extends MethordOverriding1 {
    public void Statename(String state1,String state2){
        if(state1=="Tamilnadu"){
            System.out.println("This is my state");
        }
        else if(state2=="Kerala"){
            System.out.println("This is my friend State");
        }
        else {
            System.out.println("This is another person state");
        }
    }

}
