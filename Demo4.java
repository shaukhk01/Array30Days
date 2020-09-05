/**
 * Find first Positive Missing Number
 * @author hector
 *
 */
public class Demo4 {

	public static int findPositiveMissing(int[]a) {
		
		if(a.length == 1) {
			return 0;
		}
		int i=0;
		
		while(i<a.length) {
			
			if(a[i]>0 && a[i]<a.length && a[i] !=a[a[i]-1]) {
				
				int otherIndex = a[i]-1;
				int x = a[i];
				
				a[i] = a[otherIndex];
				a[otherIndex] = x;
			}
			else
				i++;
			
		}
		
		for(i=0;i<a.length;i++) {
			
			if(a[i] !=i+1)
				return i+1;
		}
		
		return 0;
		
	}
	public static void main(String[] args) {

		int[] arr = {-2,11,1,5,3,2,8,4};
		System.out.println(findPositiveMissing(arr));
	}

}
