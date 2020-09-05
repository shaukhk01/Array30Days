/**
 * Cyclic Sort
 * @author hector
 *
 */
public class Demo1 {

	public static boolean cyclicsort(int[]a) {
		
		if(a.length==0)
			return true;
		
		int i=0;
		while(i<a.length) {
			
			if(a[i] !=i+1) {
				
				int cp = a[i]-1;
				int x = a[i];
				
				a[i] = a[cp];
				a[cp] = x;
			}
			else
				i++;
		}
		
		return true;
		
	}
	public static void main(String[]args) {
		
		int[] arr = {3,4,6,2,5,7,1};
		
		cyclicsort(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+",");
	}
}
