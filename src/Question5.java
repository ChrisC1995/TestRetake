/**
 * Created by lrterry on 10/13/16.
 */
public class Question5 {
    // Create a subclass that inherits and uses the methods and properties from this class
    static String myName = "The Johnny";

    public void printName(String name) {
        System.out.println(name);
    }
}

class Question5Sub extends Question5{

    public static void printName() {
        System.out.print(myName);
    }
}