package lecture7;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
	      int i = 1;
	      while(i<=n){
	          i++;  
	          if(i==4){
	              break; //break will take out out of immediate loop that is the while loop 
	                     //here.at i=4, output will be 2 3.
	          }
	         
	          System.out.println(i);
	      }

	}

}
