import java.util.Scanner;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question10 {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().substring(0, 1);

        System.out.print(s + " is" + (isVowel(s) ? " " : " not ") + "a vowel");
    }

    public static boolean isVowel(String s) {
        // fill this in.
        // this should check if the string, 1 character, given is a vowel.
        switch (s){
            case "a":
                System.out.println("is a vowel");
                break;
            case "e":
                System.out.println("is a vowel");
                break;
            case "i":
                System.out.println("is a vowel");
                break;
            case "o":
                System.out.println("is a vowel");
                break;
            case "u":
                System.out.println("is a vowel");
                break;
            case "A":
                System.out.println("is a vowel");
                break;
            case "E":
                System.out.println("is a vowel");
                break;
            case "I":
                System.out.println("is a vowel");
                break;
            case "O":
                System.out.println("is a vowel");
                break;
            case "U":
                System.out.println("is a vowel");
                break;

        }

        return false;
    }
}


