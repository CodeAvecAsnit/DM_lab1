import java.util.Scanner;


class ross{
    public static int ceil(double a){
        int n=(int)Math.ceil(a);
        return n;
    }
    public static int floor(double a){
        int m = (int)Math.floor(a);
        return m;
    }
    public static void main(String[] args){
        Scanner  in = new Scanner(System.in);
        double m = in.nextDouble();
        System.out.println("The celing real number is "+ceil(m));
        System.out.println("The floor real number is "+floor(m));


    }

}