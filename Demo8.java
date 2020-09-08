/**
 * Array - Find Triplets with sum smaller than Target Sum
 * @author hector
 *
 */
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Demo8 {

	public static int findTripletsSmaller(int[]a,int tsum) {
		
		Arrays.sort(a);
		int start;
		int end;
		int tripletsCount=0;
		
		List<List<Integer>> triplets = new ArrayList();
		for(int i=0;i<a.length-2;i++) {
			
			start = i+1;
			end = a.length-1;
			
			while(start < end) {
				
				int t = a[i]+a[start]+a[end];
				
				if(t < tsum) {
					
					tripletsCount = tripletsCount + end - start;
					triplets.add(Arrays.asList(a[i],a[start],a[end]));
					start++;
				}
				else
					end--;
			}
			
		}
		
		for(List d : triplets) {
			
			System.out.print(d);
		}
		return tripletsCount;
	}
	public static void main(String[] args) {

		int[] arr = {1,2,-3,4,-2};
	 System.out.println("\n\nTripletsCount:"+findTripletsSmaller(arr, 1));
		System.out.println();
	}

}
