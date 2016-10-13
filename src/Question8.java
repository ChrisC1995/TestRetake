import java.util.ArrayList;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question8 {
    // Copy the array list from the previous question to this one.
    // Iterate over the ArrayList and print out each element.
    public static void question8() {


        ArrayList<String> list = new ArrayList<>();
        list.add("Bleh");
        list.add("Blah");
        list.add("Blun");
        list.add("Bazo");
        list.add("Boozoo");
        for ( String item: list){
            System.out.println(item);
        }
    }
}
