import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int numberOfPolice = 2;
        police[] po= new police[numberOfPolice];
        for (int i = 0; i < numberOfPolice; i++) {
            System.out.println("Enter details for person " +
                    (i + 1) + ":");
            po[i] = new police();
            po[i].input();
        }
        for (int i = 0; i < numberOfPolice; i++) {
            po[i].display();
            System.out.println(+ po[i].calc());
        }
    }
}