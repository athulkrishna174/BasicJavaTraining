import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the number for b: ");
        int b = Integer.parseInt(sc.nextLine());
        sc.close();

        // swap

        a = a ^ b;
        b = a ^ b;
        a = a ^ b; 
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
