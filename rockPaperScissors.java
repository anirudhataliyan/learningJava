import java.lang.ref.ReferenceQueue;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class randomShit {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int computerPoints = 0;
        int userPoints = 0;
        int chance=0;
        int over = 9;
        while(chance<=over){
            int low = 1;
            int high = 4;
            int computerChoice = random.nextInt(high-low) + low;
            System.out.println(" ");
            System.out.print("Select your weapon (1,2,3) \n1. Rock\n2. Paper\n3. Scissors \nEnter your choice (1,2,3): ");
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1 -> {
                    switch (computerChoice) {
                        case 1 -> {
                            System.out.println("tie");
                        }
                        case 2 -> {
                            System.out.println("loss");
                            computerPoints++;
                        }
                        case 3 -> {
                            System.out.println("win!");
                            userPoints++;
                        }
                    }
                }
                case 2 -> {
                    switch (computerChoice) {
                        case 1 -> {
                            System.out.println("win!");
                            userPoints++;
                        }
                        case 2 -> {
                            System.out.println("tie");
                        }
                        case 3 -> {
                            System.out.println("loss");
                            computerPoints++;
                        }
                    }
                }
                case 3 -> {
                    switch (computerChoice) {
                        case 1 -> {
                            System.out.println("loss");
                            computerPoints++;
                        }
                        case 2 -> {
                            System.out.println("win!");
                            userPoints++;
                        }
                        case 3 -> {
                            System.out.println("tie");
                        }
                    }
                }
            }
            chance = chance + 1;
        }
        System.out.printf("Game Over!\n");
        if(userPoints>computerPoints){
            System.out.printf("User Wins by %d points!\n", userPoints);
        }
        else{
            System.out.printf("Computer wins by %d points!\n", computerPoints);
        }
    }
}
