import java.util.LinkedList;


public class JavaLinkedList {
    static void main() {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Ferari");
        cars.add("BMW");
        cars.addFirst("Lambogini");
        cars.addLast("jeep");
        System.out.println(cars);

        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars);

        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
    }
}
