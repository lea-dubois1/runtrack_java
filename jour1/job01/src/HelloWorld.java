import java.net.SocketTimeoutException;
import java.util.Scanner;
import java.util.Set;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Veuillez saisir votre nom: ");

        String name = myScan.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}