//you are given a string xyz , 
//you need to print all possible substrings of xyz
//substrings are contiguous that is output is:
//x
//xy
//xyz
//y
//yz
//z
//xz is not a substring because it is not contiguous
package Exercises;
public class AllSubStringsOfString {
    //solution code to print Substrings
    public static void printSubstrings(String str) 
    {
		//Your code goes here
        for(int i=0;i<str.length();i++){
            //We will be printing all substrings starting from index i
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));
            }
        }
	}
    //driver code to the solution
    public static void main(String[] args) {
        String str = new String("xyz");
        String str1 = new String("pqrs");
        printSubstrings(str);
        printSubstrings(str1);
        //total no of substrigs is n(n+1)/2;
    }
}
