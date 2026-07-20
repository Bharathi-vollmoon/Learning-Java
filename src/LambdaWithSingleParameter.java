import java.util.ArrayList;

public class LambdaWithSingleParameter {
    public void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("all elements");

        list.forEach(n -> System.out.println(n));

        System.out.println("even elements ");
        list.forEach(n ->

        {
          if (n%2 == 0){
              System.out.println(n);

          }
        });

    }
}
