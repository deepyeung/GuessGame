import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 3) {
            count++;
            System.out.println("參賽者，你有三次中獎機會: ");
            int guessNumber = scanner.nextInt();

            if (guessNumber < randomNumber) {
                System.out.println("號碼太大");
            } else if (guessNumber > randomNumber) {
                System.out.println("號碼太小");
            } else {
                System.out.println("恭喜過關！");
                break;
            }
        }
        scanner.close();
    }

}

