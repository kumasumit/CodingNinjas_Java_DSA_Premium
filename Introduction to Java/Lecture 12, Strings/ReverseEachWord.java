//given a string abc def ghi
//output         cba fed ihg, 
//there is only space between strings,
//there is no extra space at the beginning or at the end.
public class ReverseEachWord{
    public static String reverseEachWord(String str){
        String ans = "";
        int currentWordStart = 0;
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                //word is over, reverse the word
                int currentWordEnd = i-1; //last index of prev word
                String reversedWord = "";
                for(int j=currentWordStart;j<=currentWordEnd;j++){
                    reversedWord = str.charAt(j) + reversedWord; 
                }
                //now add the reversed string to ans
                ans = ans + reversedWord+ " ";
                //now to get start of new word
                currentWordStart = i+1;
            }
            //now lets do same thing for last word
            //here current end value of i is length of array
            // int currentWordEnd = i-1; //last index of prev word
            // String reversedWord = "";
            // for(int j=currentWordStart;j<=currentWordEnd;j++){
            //     reversedWord = str.charAt(j) + reversedWord; 
            // }
            // //now add the reversed string to ans
            // ans = ans + reversedWord;
            // System.out.println(ans);
            // //now to get start of new word
            // currentWordStart = i+1;
        }
        // System.out.println(i); //it is 11
        //now lets repeat the same operation for the last word
        int currentWordEnd = i-1; //last index of last word
        String reversedWord = "";
        // System.out.println(currentWordStart); //it is 8, first index of last word
        for(int j=currentWordStart;j<=currentWordEnd;j++){
            reversedWord = str.charAt(j)+reversedWord;
        }
        // System.out.println(reversedWord); ihg
        ans = ans + reversedWord; 
        return ans;
    }     
    //main driver code
    public static void main(String[] args) {
     String str = "abc def ghi";
     String result = reverseEachWord(str);
     System.out.println(result);    // cba fed ihg is the output
    }
}