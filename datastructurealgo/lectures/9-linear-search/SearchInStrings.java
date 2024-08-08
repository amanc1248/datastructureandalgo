public class SearchInStrings {
    public static void main(String[] args) {
        String searchString = "AmanChaudhary";
        char targetString = 'x';
        // System.out.println("Index: "+ searchTargetString(searchString, targetString));
        System.out.println(searchForEach(searchString, targetString));
    }
    static int searchTargetString(String string, char target){
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i)==target){
                return i;
            }
        };
        return -1;
    }

    static boolean searchForEach(String str, char target){
        if(str.length()==0)return false;
        for(char character: str.toCharArray()){
            if(target==character){
                return true;
            }
        };
        return false;
    }
}
