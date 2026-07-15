import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        int a=sc.nextInt();
        int b=sc.nextInt();
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
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
            case '%':
                System.out.println("Modulous of numbers:"+(a%b));
                break;
            default:
                System.out.println("Enter correct operator");

        }

    }
}
