package MethodReference;
import java.util.Arrays;
public class example{
    public  static void display(String s){
        System.out.println(s);
    }
    public void main(String[] args){
        String[] Names = {"ArunKumar","deepak","bharathi"};

        Arrays.stream(Names).forEach(example::display);
    }
}