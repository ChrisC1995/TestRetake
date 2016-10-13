/**
 * Created by lrterry on 10/13/16.
 */
public class Question6 {
    //What's the difference between private, public, protected, default?
    //Write your answer below

    public static String publicAnswer = "public can be used by the whole source";
    private static String privateAnswer = "private can only be used by the class.";
    protected static String protectedAnswer = "protected can be used within the package.";
    static String defaultAnswer = "default is the default value associated, can be used in the package.";

    public static void question6(){
        System.out.println(publicAnswer);
        System.out.println(privateAnswer);
        System.out.println(protectedAnswer);
        System.out.println(defaultAnswer);
    }


}
