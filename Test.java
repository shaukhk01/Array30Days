
public class Test {

	public static void Test(int[]a) {	
		
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
		
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+",");
		
	}
	public static void main(String[] args) {

		int[] arr = {4,3,4,5,1};
		
		Test(arr);
	}

}
