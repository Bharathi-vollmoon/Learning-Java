import java.io.*;
import java.util.*;

class TaskIn implements Runnable{
    public String doSay;

    TaskIn(String doSay){
        this.doSay = doSay;
    }

    public void run(){
        System.out.println(doSay+" to run the " +Thread.currentThread().getName());
    }
}
public class MThreadsImplementsRunnable {

    public static void main(){
        Thread say = new Thread(new TaskIn("arun ") );
        Thread write = new Thread(new TaskIn("bharathi"));
        Thread spell = new Thread(new TaskIn("deepak"));

        say.start();
        write.start();
        spell.start();
    }
}
