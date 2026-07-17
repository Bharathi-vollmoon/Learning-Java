import java.io.*;
import java.util.*;


class myThread extends  Thread{
    public void run(){
        String str = "thread is running good";
        System.out.println(str);
    }
}

public class JavaThread {
    public static void main(String args[]){
            myThread call = new myThread();
            call.start();
    }
}
