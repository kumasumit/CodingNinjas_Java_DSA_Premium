/*Print Intersection
Send Feedback
You have been given two integer arrays/lists (ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first sorted array/list (ARR1).


Input format :
The first line of input contains an integer 'N' representing the size of the first array/list.

The second line contains 'N' single space separated integers representing the elements of the first the array/list.

The third line contains an integer 'M' representing the size of the second array/list.

The fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output format :
Print the intersection elements. Each element is printed in a separate line.
Constraints :
0 <= N <= 10^6
0 <= M <= 10^6

Time Limit: 1 sec 
Sample Input 1 :
6
2 6 8 5 4 3
4
2 3 4 7 
Sample Output 1 :
2
3 
4
Sample Input 2 :
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
1 
2 
2
*/


package hashMapImplementation;
import java.util.HashMap;
public class PrintIntersection {
	public static void printIntersection(int[] arr1,int[] arr2){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				int value = map.get(arr1[i]);
				map.put(arr1[i], value+1);
				
			}else {
				map.put(arr1[i], 1); //for 1st occurence of item the value is 1
			}
		}
		//now that map is ready for arr1
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i])) {
				int frequnecy = map.get(arr2[i]);
				if(frequnecy>0) {
					System.out.println(arr2[i]);
					map.put(arr2[i], frequnecy-1);
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,4,5,2,2,3,6,5,3,2};
		int arr2[] = {2,3,2,6,6,5,1};
		printIntersection(arr1, arr2);
		/*
		2
		3
		2
		6
		5
		1
		*/ //is the output
		

	}

}
