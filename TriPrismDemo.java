
import java.util.Scanner;

public class TriPrismDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter for Triangular Prism 1:");
        System.out.print("Length: ");
        int length1 = scanner.nextInt();
        System.out.print("Base: ");
        int base1 = scanner.nextInt();
        System.out.print("Height: ");
        int height1 = scanner.nextInt();
        
        TriPrism<Integer> tp1 = new TriPrism<>();
        tp1.setValues(length1, base1, height1);

        System.out.println("\nTriangular Prism 1");
        System.out.println("Length: " + tp1.getLength());
        System.out.println("Base: " + tp1.getBase());
        System.out.println("Height: " + tp1.getHeight());
        System.out.println("The volume of the triangualar prism is " + tp1.calculateVolume());

        System.out.println("\nEnter for Triangular Prism 2 Double values:");
        System.out.print("Length: ");
        double length2 = scanner.nextDouble();
        System.out.print("Base: ");
        double base2 = scanner.nextDouble();
        System.out.print("Height: ");
        double height2 = scanner.nextDouble();

        TriPrism<Double> tp2 = new TriPrism<>();
        tp2.setValues(length2, base2, height2);

        System.out.println("\nTriangular Prism 2");
        System.out.println("Length: " + tp2.getLength());
        System.out.println("Base: " + tp2.getBase());
        System.out.println("Height: " + tp2.getHeight());
        System.out.println("The volume of the triangualar prism is " + tp2.calculateVolume());

    }
}
