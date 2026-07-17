import java.io.*;
import java.util.*;

//extending thread method
/*
class myThread extends  Thread{
    public void run(){
        String str = "thread is running by using extends thread";
        System.out.println(str);
    }
}

public class JavaThread {
    public static void main(String args[]){
            myThread call = new myThread();
            call.start();

            */
class myThread implements Runnable {
    public void run() {
        String str = "thread is running by using Runnable implemments ";
        System.out.println(str);
    }
}
    public class JavaThread {
        public static void main(String args[]) {
            myThread call = new myThread();

            //creating new thread object to call the runnable object
            Thread fam = new Thread(call);
            fam.start();
        }
    }

