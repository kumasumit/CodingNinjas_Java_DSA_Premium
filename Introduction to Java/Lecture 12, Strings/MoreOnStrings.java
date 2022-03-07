

//Some most commonly used functions on Strings
public class MoreOnStrings {



    //Driver Code
    public static void main(String[] args) {
        String str1 = " Coding ";
        String str2 = "is awesome";
        String str3= str1+str2; //+ is used to concatenate strings
        //you cant use comma to concatenate strings,
        //like you do in javascript
        System.out.println(str3); //Coding is awesome.
        System.out.println(str1.concat(str2)); //Coding is awesome.
        //str1.concat(str2) concats str2 to end of str1
        //it does not change str1 or str2 but returns a new string combing str2 to end of str1
        System.out.println(str2.concat(str1)); //concats str1 to end of str2
        //is awesome Coding
        System.out.println(str3.contains(str1)); //checks whether str1 is present in str3 or not
        //returns true in this case
        System.out.println(str1.contains(str2)); //checks whether str2 is present to str1
        //returns fasle
        System.out.println(str3.substring(0));
        //prints everything from index 0 to end of str3
        // Coding is awesome is returned
        System.out.println(str3.substring(0,5));
        //prints everything in str3 from 0 to 4, 5 is not included.
        //outputs Codi
          
        
    }
}
