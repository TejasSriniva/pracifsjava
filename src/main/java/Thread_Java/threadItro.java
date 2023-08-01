package Thread_Java;

public class threadItro extends Thread {
    @Override
    public void run() {
        System.out.println("THREAD CREATED");
    }

    public static void main(String[] args) {
        threadItro tt=new threadItro();
        tt.run();



    }
}
