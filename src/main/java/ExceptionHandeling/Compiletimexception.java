package ExceptionHandeling;

import java.io.IOException;

public class Compiletimexception {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime r= Runtime.getRuntime();
        Process pro;
        pro=r.exec("Notepad");
        Thread.sleep(5000);
        pro=r.exec("Calcu");
    }
}
