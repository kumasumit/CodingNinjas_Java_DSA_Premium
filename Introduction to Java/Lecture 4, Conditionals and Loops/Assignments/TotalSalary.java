/*Total Salary

Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
 totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.
Note: Try finding out a function on the internet to do so
Input format :
Basic salary & Grade (separated by space)
Output Format :
Total Salary
Constraints :
0 <= Basic Salary <= 7,500,000
Sample Input 1 :
10000 A
Sample Output 1 :
17600
Sample Input 2 :
4567 B
Sample Output 2 :
8762
Explanation of Input 2:
We have been given the basic salary as Rs. 4567. We need to calculate the hra, da and pf. 
Now when we calculate each of the, it turns out to be:
hra =  20% of Rs. 4567 = Rs. 913.4
da = 50% od Rs. 4567 = Rs. 2283.5
pf = 11% of Rs. 4567 = Rs. 502.37

Since, the grade is 'B', we take allowance as Rs. 1500.
On substituting these values to the formula of totalSalary, we get Rs. 8761.53 and now rounding it off will result in Rs. 8762 and hence the Answer.
*/


import java.util.Scanner;
public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s = new Scanner(System.in);
		   char grade = s.next().charAt(0);
	        int basic = s.nextInt();
	        double hra = (0.2)* basic;
	        double da = (0.5) * basic;
	        int allowance = 1300;
	        if(grade=='A'){
	            allowance = 1700;
	            
	        }else if(grade=='B'){
	            allowance = 1500;
	        }else{
	            allowance = 1300;
	        }
	        double pf = (0.11) * basic;
	        
	        int totalSalary = (int)Math.round((basic+hra+da+allowance-pf)); //round is inbuilt Math function for rounding off numbers. 
	        
	        System.out.println(totalSalary);
	        s.close();

	}

}
