public class FindEvenDigitCount {
    public static void main(String[] args){
        int[] array = {1234,2345,45,34,333,2,55555,90,1,2,3,4,5,6,7,11,22,33,44};
        System.out.println("Even digit counts: "+ findEvenDigits(array));
        System.out.println("Even digits count using findEvenDIgitsUsingDivid:" + findEvenDigitsUsingDivide(array));
    }
    static int findEvenDigits(int[]arr){
        int evenCount = 0;
        for(int elem: arr){
            String convertedString = elem+"";
            if(convertedString.length()%2 ==0)evenCount++;
        };
        return evenCount;
    }
    static int findEvenDigitsUsingDivide(int[] arr){
        int evenCount = 0;
        for(int num: arr){
            int count = 0;
            if(num==0){
                count = 1;
                continue;
            }
            while(num>0){
                count++;
                num = num/10;
            }
            if(count%2==0)evenCount++;
        };
        return evenCount;
    }

    static int digits(int num){
        return (int)(Math.log10(num)+1); 
    }

}
