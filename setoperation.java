import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

class set{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of data");
        int n= in.nextInt();
        int []a = new int[n];
        int []b= new int[n];
        int i=0;
        System.out.println("Enter the data of the first set");
        for(i=0;i<n;++i){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the data of the second set");
        for(i=0;i<n;++i){
            b[i]=in.nextInt();
        }
        int[] union = findUnion(a, b);
        int[] intersection = findIntersection(a, b);
        int[] difference = findDifference(a, b);
        int[] symmetricDifference = findSymmetricDifference(a, b);

        System.out.println("Set A: " + Arrays.toString(a));
        System.out.println("Set B: " + Arrays.toString(b));
        System.out.println("Union: " + Arrays.toString(union));
        System.out.println("Intersection: " + Arrays.toString(intersection));
        System.out.println("Difference (A - B): " + Arrays.toString(difference));
        System.out.println("Symmetric Difference: " + Arrays.toString(symmetricDifference));
    }

    public static int[] findUnion(int[] setA, int[] setB) {
        HashSet<Integer> unionSet = new HashSet<>();
        for (int element : setA) {
            unionSet.add(element);
        }
        for (int element : setB) {
            unionSet.add(element);
        }

        return unionSet.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] findIntersection(int[] setA, int[] setB) {
        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int element : setA) {
            if (containsElement(setB, element)) {
                intersectionSet.add(element);
            }
        }

        return intersectionSet.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] findDifference(int[] setA, int[] setB) {
        HashSet<Integer> differenceSet = new HashSet<>();
        for (int element : setA) {
            if (!containsElement(setB, element)) {
                differenceSet.add(element);
            }
        }

        return differenceSet.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] findSymmetricDifference(int[] setA, int[] setB) {
        int[] union = findUnion(setA, setB);
        int[] intersection = findIntersection(setA, setB);
        return findDifference(union, intersection);
    }

    private static boolean containsElement(int[] array, int element) {
        for (int item : array) {
            if (item == element) {
                return true;
            }
        }
        return false;
    }
}
