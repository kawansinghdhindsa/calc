import java.util.Scanner;//Tested
public class JavaCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("What is A:");
        double a = input.nextDouble();
        System.out.printf("What is B:");
        double b = input.nextDouble();
        System.out.printf("operator");
        String operator = input.next();
        switch (operator) {
            case "+":
            case "plus":
                System.out.printf("%.2f + %.2f = %.2f",a,b,a+b);
                break;
            
            case "-":
            case "minus":
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
                System.out.printf("%.2f + %.2f = %.2f",a,b,a/b);
                break;
        
            default:
                System.out.println("operator not recognized");
                return;
        }
    }
}

