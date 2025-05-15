
import java.util.Scanner;


public class ThreadDemo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Name your first thread: ");
        String name1 = s.nextLine();

        System.out.print("Name your second thread: ");
        String name2 = s.nextLine();

        MyThread t1 = new MyThread(name1);
        MyThread t2 = new MyThread(name2);

        System.out.println(t1.getName() + " is " + t1.getState());
        System.out.println(t2.getName() + " is " + t2.getState());
        System.out.println("\nStarting the threads...");

        t1.start();
        t2.start();
        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nAfter sleep...");
        System.out.println(t1.getName() + " is " + t1.getState());
        System.out.println(t2.getName() + " is " + t2.getState());

    }
}
