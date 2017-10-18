import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String input = scanner.nextLine();

        if("Alice".equals(input) || "Bob".equals(input)) {
            System.out.println("Hello " + input);
        }
    }
}
