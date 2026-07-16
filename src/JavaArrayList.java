import java.util.ArrayList;

public class JavaArrayList {
    static void main() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("bmw");
        cars.add("honda");
        cars.add("hyundai");


        cars.add(2,"hello");
        System.out.println("showed second element : "+ cars.get(2));
        System.out.println(cars.size());
        System.out.println(cars);

    }
}
