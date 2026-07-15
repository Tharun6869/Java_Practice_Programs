import java.util.Scanner;
public class CompareNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two values:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        if(a>b){
            System.out.println("A is largest");
        }
        else if(b>a){
            System.out.println("B is largest");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
