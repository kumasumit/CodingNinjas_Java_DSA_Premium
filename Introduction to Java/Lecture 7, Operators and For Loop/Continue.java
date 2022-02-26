package lecture7;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
	      int i = 1;
	      while(i<=n){
	          i++; // if you put i++ after continue it will result in infinite loop after 2 3 4 because continue will skip the current iteation and i++ will never occur. 
	          if(i==4){
	              continue;
	          }
	         
	          System.out.println(i);
	      }

	}

}
