package burns.chris.names;
import java.util.Scanner;
public class Names {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.println("Please enter name: ");
        String names = name.nextLine();

        if (names.equals("Alice")) {
            System.out.println("Hello Alice!");

        } else if (names.equals("Bob")) {
            System.out.println("Hello Bob!");

        } else{
            System.out.println("Name not recognized");
        }

    }
}


