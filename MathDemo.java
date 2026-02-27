import java.util.Scanner;

public class MathDemo {
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


    public static int sum(int[] args) {
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            total += args[i]; 
        }
        return total;
    }

    public static float mean(int[] args) {
        if (args.length == 0) return 0; 
        int total = sum(args); 
        return (float) total / args.length; 
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        
        int result = 1; 
        for (int i = 1; i <= n; i++) {
            result *= i; 
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1 ");
        int num1 = scanner.nextInt();
        
        System.out.print("num2 ");
        int num2 = scanner.nextInt();

        System.out.print("num amount ");
        int arraySize = scanner.nextInt();
        
        int[] myNumbers = new int[arraySize]; 

        System.out.println(arraySize + " this is array");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("num " + (i + 1) + ": ");
            myNumbers[i] = scanner.nextInt(); 
        }

        System.out.print("factorial ");
        int factNum = scanner.nextInt();

        System.out.println("min of " + num1 + " and " + num2 + ": " + MathDemo.min(num1, num2));
        System.out.println("max of " + num1 + " and " + num2 + ": " + MathDemo.max(num1, num2));
        System.out.println("sum of array: " + MathDemo.sum(myNumbers));
        System.out.println("mean of array: " + MathDemo.mean(myNumbers));
        System.out.println("factorial of " + factNum + ": " + MathDemo.factorial(factNum));

        scanner.close(); 
    }
}


// without static there would be a waste memory and lines of code creating an object first
// such as 
// MathDemo myMath = new MathDemo();
// int result = myMath.max(5, 10);

// however with static it is possible to call the method directly on the class name itself
// int result = MathDemo.max(5, 10);