import java.util.ArrayList;
import java.util.Collections;//import collectinos class



public class SortArrayList {
    static void main() {

        //string data types

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Toyoto");
        cars.add("Rolls Roice");

        Collections.sort(cars);
        for (String i : cars){
            System.out.println(i);
        }

        // integer types
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(92);
        num.add(34);
        num.add(32);
        num.add(56);
        Collections.sort(num,Collections.reverseOrder());
        for(int i : num){
            System.out.println(i);
        }


    }
}


