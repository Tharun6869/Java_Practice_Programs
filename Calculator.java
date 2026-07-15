import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Enter the operator(+,-,x,/,%):");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("Addition of numbers:"+(a+b));
                break;
            case '-':
                System.out.println("Subtraction of numbers:"+(a-b));
                break;
            case '*':
                System.out.println("Multiplication of numbers:"+(a*b));
                break;
            case '/':
                if(b != 0)
                    System.out.println("Division of numbers : " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
            case '%':
                if(b != 0)
                    System.out.println("Modulous of numbers:" + (a % b));
                else
                    System.out.println("Cannot modulous by zero");
                break;
            default:
                System.out.println("Enter correct operator");

        }
        sc.close();
    }
}
