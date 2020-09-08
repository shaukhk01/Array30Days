/**
 * Array - Find Minimum subarray length 
 * (Such that If we sort this subarray, whole array will be Sorted)
 * 
 * @author hector
 *
 */
public class Demo6 {

	
	public static int findMinSubArrLength(int[]a) {
	
		int start = 0;
		int end = a.length-1;
		
		while(start<a.length && a[start] < a[start+1]) {
			start++;
		}
		
		
		while(a[end-1]<a[end]) {
			
			end--;
			
		}
		
		/*for(int i=start;i<end;i++) {
			System.out.print(a[i]+",");
		}*/
		int min =Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=start;i<end;i++) {
			
			max = Math.max(a[i],max);
			min = Math.min(a[i],min);
		}
		
		
		while(start>=0 && a[start]>min) {
			
			start--;
		}
		
		while(end<a.length-1 && a[end]<a[end+1]) {
			
			end++;
		}
		
		return (end -start-1);
	}
	public static void main(String[] args) {

		int[] arr = {1,2,5,3,0,12,13,8,15,18};
		System.out.println(findMinSubArrLength(arr));
	}

}
