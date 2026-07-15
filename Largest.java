import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 values:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if(a>b&&a>c){
            System.out.println("A is largest");
        }
        else if(b>a&&b>c){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
    }
}
