package lecture2;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		int c = a/b; //this prints 3 because 10/3 quotient is 3
		double d = 10/30; //prints 0.0 because 10 and 30 are int data type and then it is converting it into a decimal type.
		
		double e = 10.0/30; 
		//prints 0.333333333 because 10.0 is of decimal data type and 30 is of int type. 
		System.out.println(e);
                int c = 3*2/3;
		// will give output 2 because of associativity 3*2 will be done first, and then /3 will be done. 
		//the execution flows from left to right.
		int d = 3/3 *2; //here 3/3 is done first after that 1*2 is 2 and we get the answer. 
		System.out.print(d);

	}

}
