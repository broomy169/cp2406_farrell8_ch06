/**
 * Created by Graeme on 24/08/2016.
 */
public class Factorials {
    public static void main(String[] args) {
        int fact;

        for (int i = 1; i <= 10; i++) {
            fact = i;
            for (int x = i - 1; x > 0; --x){
                fact = fact * x;
            }
            System.out.println("Factorial of " + i + " is " + fact);
        }
    }
}
