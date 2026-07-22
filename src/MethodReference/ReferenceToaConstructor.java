package MethodReference;
import java.util.function.Supplier;

class Animal{
        Animal(){
        System.out.println("Lion is the king of the Jungle");
    }
}
public class ReferenceToaConstructor {
    static void main() {
        Supplier<Animal> Lion = Animal::new;
                Lion.get();
    }
}
