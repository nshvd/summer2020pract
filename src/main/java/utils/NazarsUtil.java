package utils;

public class NazarsUtil {

    public static void sayHello() {
        System.out.println("Hello world!");
    }

    public static void sayBye() {
        System.out.println("Bye");
    }

    public static void sayHello(String name) {
        System.out.println("Hello: " + name);
    }

    public static void sayHello(String name, String lastName) {
        System.out.println("Hello: " + name + lastName);
    }

    public static void someMethod() {
        System.out.println("Hello: ");
    }

    public static void sayHello2(String name, String lastName) {
        System.out.println("Hello: " + name + lastName);
    }


    public void byeBye(){
        System.out.println("say bye!");
    }


    public static void printSum(int i, int j) {
        System.out.println(i + j);
    }

    public static void weather(String day, String night){
        System.out.println("Today's weather is" + day + night);
    }
}
