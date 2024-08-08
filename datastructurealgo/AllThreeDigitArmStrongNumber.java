public class AllThreeDigitArmStrongNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int num = i;
            int totalValue = 0;
            while (num > 0) {
                int rem = num % 10;
                totalValue += (rem * rem * rem);
                num = num / 10;
            }
            ;
            if (totalValue == i) {
                System.out.println(i + " is a armstrong number.");
            }
        }
    }
}
