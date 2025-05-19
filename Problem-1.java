//This problem is solved in java
import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter operation (addition, subtraction, multiplication, division): ");
        String type_of_operation = sc.nextLine();
        
        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, type_of_operation);
        
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
        
        sc.close();
    }
    
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "addition":
                return a + b;
            case "subtraction":
                return a - b;
            case "multiplication":
                return a * b;
            case "division":
                if (b == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return Double.NaN;
                }
                return a / b;
            default:
                System.out.println("Operation not matched.");
                return Double.NaN;
        }
    }
    
}
