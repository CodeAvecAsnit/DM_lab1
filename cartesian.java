import java.util.*;

class Cartesian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the sets: ");
        int n = scanner.nextInt();
        char[] setA = new char[n];
        char[] setB = new char[n];

        System.out.println("Enter the elements for set A: ");
        for (int i = 0; i < n; i++) {
            setA[i] = scanner.next().charAt(0);
        }

        System.out.println("Enter the elements for set B: ");
        for (int i = 0; i < n; i++) {
            setB[i] = scanner.next().charAt(0);
        }

        System.out.print("The Cartesian product is: {");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                car(setA[i], setB[j]);
            }
        }
        System.out.print("}");
    }

    public static void car(char a, char b) {
        System.out.print("(" + a + "," + b + "),");
    }
}
