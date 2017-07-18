public class Solution{
	public int maxSubArray(final List<Integer> a){
	    int max = a.get(0), currMax = a.get(0);
	    for(int i = 1; i < a.size(); i++){
	        currMax = Math.max(a.get(i), currMax + a.get(i));
	        max = Math.max(max, currMax);
	    }
	    return max;
	}
}