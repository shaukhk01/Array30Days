/**
 * Find missing and duplicate Number from array
 * @author hector
 *
 */
import java.util.ArrayList;
import java.util.List;
public class Day0 {

	public static List<List<Integer>>findMissingDuplicate(int[]a){
		
		if(a.length == 0)
			return null;
		
		int i=0;
		while(i<a.length) {
			
			if(a[i] !=a[a[i]-1]) {
				
				int otherIndex = a[i]-1;
				int x = a[i];
				a[i] = a[otherIndex];
				a[otherIndex] = x; 
			}
			else
				i++;
		}
		
		ArrayList<Integer>missing = new ArrayList<Integer>();
		ArrayList<Integer>duplicate = new ArrayList<Integer>();
		for(i=0;i<a.length;i++) {
			
			if(a[i] !=i+1) {
				
				missing.add(i+1);
				duplicate.add(a[i]);
			}
		}
		
		List<List<Integer>> data = new ArrayList<List<Integer>>();
		
		data.add(missing);
		data.add(duplicate);
	
		return data;
		
	}
	public static void main(String[] args) {

		int[] arr = {2,6,4,4,3,2};
		
		List<List<Integer>> data = findMissingDuplicate(arr);
		System.out.println(data);
	}

}
