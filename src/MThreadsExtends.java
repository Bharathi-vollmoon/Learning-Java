import java.io.*;
import java.util.*;


class task extends Thread{

    public String food;

    task(String food){
        this.food = food;
    }
    public void run(){
        System.out.println(food+" your order is being prepared by "+Thread.currentThread().getName());
    }
}

public class MThreadsExtends {
    void main(){
        Thread item1 = new task("dosa");
        Thread item2 = new task("idly");
        Thread item3 = new task("biriyani");
        Thread item4 = new task("noodules");

        item1.start();
        item2.start();
        item3.start();
        item4.start();
    }
}
