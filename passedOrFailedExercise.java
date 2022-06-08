import java.util.Scanner;

public class randomShit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        float marksPhy = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        float marksChem = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        float marksMaths = sc.nextInt();
        float total=(marksChem+marksPhy+marksMaths);
        float percentage=(total/300)*100;
        System.out.print("The obtained percentage is: ");
        System.out.println(percentage);
        if(marksMaths<=33f || marksChem<=33f || marksPhy<=33f){
            System.out.println("You're failed! All the best for next exam!");
        }
        else{
            System.out.println("Congrats! You're passed! ");
        }
    }
}
