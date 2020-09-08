/**
 * 
 * Array - Find all Triplets for given Sum 
 * Check if Triplet exists for given Sum
 * @author hector
 *
 */
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Demo7 {

	public static List<List<Integer>> findAllTriplets(int[]a,int tsum) {
		
		Arrays.sort(a);
		int start = 0;
		int end = 0;
		List<List<Integer>> triplets = new ArrayList();
		for(int i=0;i<a.length-2;i++) {
			
			int sum = tsum - a[i];
			
			start = i+1;
			end = a.length-1;
			
			while(start < end) {
				
				int t = a[start] + a[end];
				
				if(t == sum) {
					triplets.add(Arrays.asList(a[start],a[end],a[i]));
					
					start++;
					end--;
				}
				
				else if(t< sum) {
					start++;
				}
				
				else if(t>sum) {
					end--;
				}
					
			}
			
		}
		return triplets;
	}
	public static void main(String[] args) {

		int[] arr = {1,2,-3,4,-2,-1};
		
		List<List<Integer>> triplets = findAllTriplets(arr, 1);
		
		System.out.println(triplets);
	}

}
