/**
 * Find subarray with multiplication of element less then given number.
 * @author hector
 *
 */

import java.util.List;
import java.util.ArrayList;
public class Demo5 {

	public static List<List<Integer>> subArrayWithMultiplication(int[]a,int key){
		
		int mul = 1;
		int start = 0;
		
		List<List<Integer>>solution = new ArrayList<List<Integer>>();
		
		for(int i=0;i<a.length;i++) {
			
			mul =   mul * a[i];
			
			while(mul >= key) {
				
				mul = mul/a[start];//for making equivelent to 40 or less then 40
				
				start++;//increase arr[start] so that it can make 40 or less then given 40
			}
			
		List<Integer> list = new ArrayList<Integer>();
			for(int j = i;j>=start;j--) {
				
				list.add(0,a[j]);
				
				solution.add(new ArrayList<Integer>(list));
			}
		}
		
		return solution;
	}
	public static void main(String[] args) {

		int[] arr = {4,2,5,3,6};
		
		List<List<Integer>> data = subArrayWithMultiplication(arr,40);
		System.out.println(data);
	}
}
