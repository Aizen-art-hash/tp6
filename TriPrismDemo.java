
public class TriPrismDemo {

    public static void main(String[] args) {

        TriPrism<Integer> tp1 = new TriPrism<>();
        tp1.setLength(10);
        tp1.setBase(7);
        tp1.setHeight(5);
        System.out.println("Triangular Prism 1");
        System.out.println("Length: " + tp1.getLength());
        System.out.println("Base: " + tp1.getBase());
        System.out.println("Height: " + tp1.getHeight());
        System.out.println("The volume of the triangular prism is " + tp1.calculateVolume());
        System.out.println();

        TriPrism<Double> tp2 = new TriPrism<>();
        tp2.setLength(9.10);
        tp2.setBase(6.25);
        tp2.setHeight(4.20);
        System.out.println("Triangular Prism 2");
        System.out.printf("Length: %.2f\n", tp2.getLength());
        System.out.printf("Base: %.2f\n", tp2.getBase());
        System.out.printf("Height: %.2f\n", tp2.getHeight());
        System.out.printf("The volume of the triangular prism is %.4f\n", tp2.calculateVolume());
    }
}
   