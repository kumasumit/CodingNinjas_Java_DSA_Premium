package lecture7;

public class Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
	      int i = 1;
	      while(i<=n){
	          i++;  
	          if(i==4){
	              return; //return will take out out of main loop, that is the calling function,
	                      //here.at i=4, output will be 2 3 after 4 the control exists from main.
	          }
	         
	          System.out.println(i);
	      }


	}

}
