
public class ExceptionHandiling {
    static void main() {
       try {
           int num = 10;
           int b = 0;
           System.out.println(num/b);
       }catch (ArithmeticException e){
           System.out.println("the num is not divisible by zero");
       }
        System.out.println("end");
    }
}
