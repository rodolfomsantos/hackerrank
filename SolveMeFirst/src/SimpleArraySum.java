import java.util.SortedMap;
import java.util.stream.IntStream;

public class SimpleArraySum {

	public static void main(String[] args) {

		// solution one - correct result but wrong answer 
		/*int [] simpleArraySum = {1,2,3,4,10,11};// initializing the array
		int sum = IntStream.of(simpleArraySum).sum(); // returns the sum of elements in this array
*/
		// solution two - also worked , only was missing the correct inputs
		int simpleArraySum []= {1,2,3,4,10,11};// initializing the array
		int sum = 0;
		
		for (int i: simpleArraySum)
			sum += i; 
		
		/*public class Solution {

		    public static void main(String[] args) {

				Scanner in = new Scanner(System.in); // necessário para ir buscar os inputs automáticos
		    int n = in.nextInt(); // The first line contains an integer, N , denoting the size of the array.
		    int array[] = new int[n]; // setting the size of the array
		    int sum = 0;
		    for(int i=0; i < n; i++){
		        array[i] = in.nextInt(); // setting the values of each position of the array. "The second line contains N space-separated integers representing the array's elements."
		         sum += array[i];
		    }        
		    System.out.println(sum);
		    }
		}
*/		
		System.out.println(sum);
	}

}

