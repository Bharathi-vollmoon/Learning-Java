import java.util.ArrayList;

public class ForEachLoopArrayList {
    static void main() {
        ArrayList<Integer> nume = new ArrayList<Integer>();
        nume.add(1);
        nume.add(2);
        nume.add(3);

        //for(DataType variableName : ArrayName)

        for(Integer number : nume){
            System.out.println(number);
        }
    }
}

