import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int original = num;
        int totalValue = 0;
        while (num > 0) {
            int rem = num % 10;

            totalValue = totalValue + (rem * rem * rem);
            num = num / 10;
        }
        // System.out.println(num+":: "+totalValue);
        if (original == totalValue) {
            System.out.println(original + " is a armstrong value");
        }else{
            System.out.println(original + " is not a armstrong number");
        }
    }
}
