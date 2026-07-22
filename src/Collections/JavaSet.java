package Collections;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class JavaSet {

    static void main() {
        //String objects

//HashSet

        HashSet<String> fruits = new HashSet<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Apple");

        //output:
        //unorderd
        // not allows duplicate

        System.out.println(fruits);

        System.out.println(fruits.contains("Mango"));
        System.out.println(fruits.size());
        fruits.clear();
        System.out.println(fruits);


        // integer objects
        HashSet<Integer> myNum = new HashSet<Integer>();
        myNum.add(2);
        myNum.add(4);
        myNum.add(7);

        for(int i=0; i<=10; i++){
            if(myNum.contains(i)){
                System.out.println(i+"yes its contains!!!!");
            }else{
                System.out.println(i+"not contains");
            }
        }
        System.out.println("---------------------------------------------------------------------------------");


        //TreeSet -------// automatically sorted

        TreeSet<String> name = new TreeSet<String>();
        name.add("bharathi");
        name.add("arunkumar");
        name.add("deepak");
        name.add("arunkumar");
        name.add("arun");

        System.out.println(name);

        //using for-each loop

        for (String hi : name ){
            System.out.println(hi);
        }


        //LinkedhashSet

        //insertion order not converted sorted order

        LinkedHashSet<String> animal = new LinkedHashSet<String>();
        animal.add("Lion");
        animal.add("Tiger");
        animal.add("Lion");
        animal.add("Elephant");
        animal.add("pig");

        System.out.println(animal);

    }
}

