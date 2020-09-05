/**
 * Check cycle present in circular Array
 * @author hector
 *
 */
public class Demo2 {

	public static boolean checkCycle(int[]a) {
		
		if(a.length<=1)
			return false;
		
		int slow,fast;
		boolean ifForward;
		for(int i=0;i<a.length;i++) {
			
			slow = fast = i;
			ifForward = a[i]>0;
			while(true) {
			slow = getNextPosition(a,slow,ifForward);
			
			if(slow == -1)
				break;
			
			fast = getNextPosition(a,fast,ifForward);
			
			if(fast == -1)
				break;
			
			fast = getNextPosition(a,fast,ifForward);
			
			if(fast == -1)
				break;
			
			if(fast == slow)
				return true;
			
		}
	}
		return false;
}
	
	public static int getNextPosition(int[]a,int index,boolean ifForward) {
		
		boolean direction = a[index]>=0;
		
		if(direction !=ifForward)
			return -1;
		
		int nextIndex = (index + a[index])%a.length;
		
		if(index < 0 ) {
			
			nextIndex = index+a.length;
		}
		
		if(index == nextIndex)
			return -1;
		
		return nextIndex;
	}
	public static void main(String[] args) {

		int[] arr = {1,1,2,1,2};
		
		
		System.out.println(checkCycle(arr));
		
	}

}
