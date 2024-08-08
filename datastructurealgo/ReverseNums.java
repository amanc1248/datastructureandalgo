public class ReverseNums {
    public static void main(String[] args){
        int n = 23597;
        int reversedNum = 0;
        while(n>0){
            int rem = n%10;
            reversedNum = (reversedNum*10) + rem;
            n = n/10;
        };
        System.out.println(reversedNum);
    }
}
