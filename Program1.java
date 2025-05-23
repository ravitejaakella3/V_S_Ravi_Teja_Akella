/*  
Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
  Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
  Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string */

//This problem is solved in java
import java.util.Scanner;

class Program1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        
        sc.nextLine(); 
        System.out.print("Enter operation (addition, subtraction, multiplication, division): ");
        String type_of_operation = sc.nextLine();
        
        Program1 calc = new Program1(); 
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
