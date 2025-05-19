/*  
Problem-3: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5
    5) input a = 5, then output : 1, 3, 5, 7, 9
    6) input a = 6, then output : 1, 3, 5, 7, 9
    .
    .
    7) input a = x, then output : 1, 3, 5, 7, ....... */
//solve this  problem in java
import java.util.Scanner;

public class Problem3_OddAdjusted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        // If even, reduce to the previous odd number
        int count = (a % 2 == 0) ? a - 1 : a;

        int num = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(num);
            num += 2;
            if (i < count - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
