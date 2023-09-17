import java.util.Scanner;
public class police{
    private int age;
    private String name;

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = in.nextLine();
        System.out.println("Enter the age: ");
        this.age = in.nextInt();
    }

    public double calc() {
        if (age <= 20) {
            return 1.0;
        } else if (age > 30) {
            return 0.0;
        } else {
            int n = (30 - age);
            double b = n / 10.0;
            return b;
        }
    }
    public void display(){
        System.out.println("The degree of for " +name
                +"'s membership is : ");
    }
}