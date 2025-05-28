
import java.util.Scanner;


public class TriPrismDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TriPrism<Integer> tp1 = new TriPrism<>();
        System.out.println("Enter values for Triangular Prism 1 Integer:");
        System.out.print("Length: ");
        tp1.setLength(scanner.nextInt());
        System.out.print("Base: ");
        tp1.setBase(scanner.nextInt());
        System.out.print("Height: ");
        tp1.setHeight(scanner.nextInt());

        System.out.println("Triangular Prism 1");
        System.out.println("Length: " + tp1.getLength());
        System.out.println("Base: " + tp1.getBase());
        System.out.println("Height: " + tp1.getHeight());
        System.out.println("The volume of the triangular prism is " + tp1.calculateVolume());
        System.out.println();

        TriPrism<Double> tp2 = new TriPrism<>();
        System.out.println("Enter values for Triangular Prism 2 Double:");
        System.out.print("Length: ");
        tp2.setLength(scanner.nextDouble());
        System.out.print("Base: ");
        tp2.setBase(scanner.nextDouble());
        System.out.print("Height: ");
        tp2.setHeight(scanner.nextDouble());

        System.out.println("Triangular Prism 2");
        System.out.printf("Length: %.2f\n", tp2.getLength());
        System.out.printf("Base: %.2f\n", tp2.getBase());
        System.out.printf("Height: %.2f\n", tp2.getHeight());
        System.out.printf("The volume of the triangular prism is %.4f\n", tp2.calculateVolume());

        scanner.close();
    }
}