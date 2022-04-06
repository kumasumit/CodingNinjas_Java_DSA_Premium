/*
Buy the ticket
Send Feedback
You want to buy a ticket for a well-known concert which is happening in your city. But the number of tickets available is limited. Hence the sponsors of the concert decided to sell tickets to customers based on some priority.
A queue is maintained for buying the tickets and every person is attached with a priority (an integer, 1 being the lowest priority).
The tickets are sold in the following manner -
1. The first person (pi) in the queue requests for the ticket.
2. If there is another person present in the queue who has higher priority than pi, then ask pi to move at end of the queue without giving him the ticket.
3. Otherwise, give him the ticket (and don't make him stand in queue again).
Giving a ticket to a person takes exactly 1 minute and it takes no time for removing and adding a person to the queue. And you can assume that no new person joins the queue.
Given a list of priorities of N persons standing in the queue and the index of your priority (indexing starts from 0). Find and return the time it will take until you get the ticket.
Input Format:
The first line of input contains an integer, that denotes the value of total number of people standing in queue or the size of the array of priorities. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array of priorities.
The following contains an integer, that denotes the value of index of your priority. Let us denote it with symbol k.
Output Format :
The first and only line of output contains the time required for you to get the ticket.
Constraints:
Time Limit: 1 sec
Sample Input 1 :
3
3 9 4
2
Sample Output 1 :
2
Sample Output 1 Explanation :
Person with priority 3 comes out. But there is a person with higher priority than him. So he goes and then stands in the queue at the end. Queue's status :  {9, 4, 3}. Time : 0 secs.
Next, the person with priority 9 comes out. And there is no person with higher priority than him. So he'll get the ticket. Queue's status :  {4, 3}. Time : 1 secs.
Next, the person with priority 4 comes out (which is you). And there is no person with higher priority than you. So you'll get the ticket. Time : 2 secs.
Sample Input 2 :
5
2 3 2 2 4
3
Sample Output 2 :
4
*/
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
class Pair{
	int value; //stores the value of the element
	int index; //stores the index of the element
}
public class BuyTicket{
	public static int buyTicket(int input[], int k) {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		//ceates a max heap stores the values with maximum as the haed/root
		Queue<Pair> queue = new LinkedList<>(); //a queue to store the Pair
        
		for(int i=0;i < input.length;i++) {
			Pair pair = new Pair(); //create a new pair object every time from start to finish
			pair.value = input[i]; //put the value in pair.value
			pair.index = i; //put the index in pair.index
			priorityQueue.add(input[i]); //add all the input elements in priority queue with max as the head/root
			queue.add( pair ); //add pair to the queue every time
		}
		int count = 0; //maintain a count variable to calculate time
		while(!queue.isEmpty()) {
			
			if(priorityQueue.peek() == queue.peek().value) //if the element at the start of the queue is same as max of priority queue
			 {

				priorityQueue.remove(); //remove it from max heap
				Pair pair = queue.poll(); //remove the pair from queue
				count++; //add 1 to time
				if( pair.index == k ) { //if removed index is same as index passed to the function, return else continue
					break;
				}
			}
			else {
				
				queue.add(queue.poll()); //if element is not the largest, pop it and push it to the back of the queue
				
			}
			
		}
		return count;

	}
	//main function to test driver code
	public static void main(String[] args) {
		int arr[] = {2,3,2,2,4};
        System.out.println(buyTicket(arr, 3)); //output 4
		int arr1[] = {3,9,4};
		System.out.println(buyTicket(arr1, 2)); //output 2
/*Person with priority 3 comes out. But there is a person with higher priority than him. So he goes and then stands in the queue at the end. Queue's status :  {9, 4, 3}. Time : 0 secs.
Next, the person with priority 9 comes out. And there is no person with higher priority than him. So he'll get the ticket. Queue's status :  {4, 3}. Time : 1 secs.
Next, the person with priority 4 comes out (which is you). And there is no person with higher priority than you. So you'll get the ticket. Time : 2 secs.
*/

	}	

}