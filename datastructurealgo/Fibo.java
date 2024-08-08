import java.util.Scanner;
public class Fibo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // System.out.print("Please enter the number: ");
        // int a = in.nextInt();
        // System.out.println("You entered the number "+a);
        
        int a = 0;
        int b = 1;
        System.out.println("Which fibonth number you want?");
        int number = in.nextInt();
        int count = 2;
        while (count<=number) {
            int temp = b;
            b = a+b;
            a = temp;
            count++;
        }
        System.out.println("Required number: "+b);
    }
}
