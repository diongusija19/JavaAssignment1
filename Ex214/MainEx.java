
import java.util.Scanner;

public class MainEx {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        // Using one System.out.println statement
        System.out.println("1 2 3 4");

        // Using four System.out.print statements
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4\n");

        // Using one System.out.printf statement
        System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);

        input.close();
    }
}    
