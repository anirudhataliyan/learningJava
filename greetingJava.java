import java.util.Scanner;

public class excercise {
    public static void main(String[] args) {
        String name = "An Ir Rd Ha";
        String name2 = (name.replace(" ", "_"));
        System.out.println(name2);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name please: ");
        String name3 = sc.next();
        String letter = "Hello <|name|> Thanks for joining me!";
        letter = letter.replace("<|name|>", name3);
        System.out.println(letter);
    }

}
