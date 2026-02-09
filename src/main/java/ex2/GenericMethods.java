package ex2;

public class GenericMethods {
    public static <A, B, C> void printElements (A a, B b, C c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
