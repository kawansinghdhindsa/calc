import java.util.Scanner;//Tested
public class JavaCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("What is A: ");
        double a = input.nextDouble();
        System.out.printf("What is B: ");
        double b = input.nextDouble();
        System.out.printf("What is the operator: ");
        String operator = input.next();
        switch (operator) {
            case "+":
            case "plus":
            case "add":
                addition(a, b);;
                break;
            
            case "-":
            case "minus":
            case "sub":
            case "subtract":
                System.out.printf("%.2f - %.2f = %.2f",a,b,a-b);
                break;
            
            case "x":
            case "*":
            case "times":
            case "multiply":
                System.out.printf("%.2f * %.2f = %.2f",a,b,a*b);
                break;
            
            case "/":
            case "divide":
                System.out.printf("%.2f / %.2f = %.2f",a,b,a/b);
                break;
        
            default:
                System.out.println("operator not recognized");
                return;
        }
    }
    public static void addition(double a,double b) {
        double c = a+b;
        System.out.printf("%.2f + %.2f = %.2f",a,b,c);
    }
    public static double subtraction() {
        return 0;
    }
    public static double multiplication(){
        return 0;
    }
    public static double division() {
        return 0;
    }
}

