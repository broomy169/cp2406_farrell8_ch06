import java.util.Scanner;

/**
 * Created by Graeme on 19/08/2016.
 */
public class EvenEntryLoop {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Type an even number or 999 to stop: ");
        num = input.nextInt();

        while (num != 999) {
            if (num % 2 == 0) System.out.println("Good job!");
            else System.out.println("Input is not even.");
            System.out.print("Type an even number or 999 to stop: ");
            num = input.nextInt();
        }
    }
}
