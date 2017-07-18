public class Solution{
	public boolean isPalindrome(int n){
	    if(n < 0){
	        return false;
	    }
	    else{
	        String ns = n + "";
	        StringBuilder sb = new StringBuilder(ns);
	        sb.reverse();
	        return ns.equals(sb.toString());
	    }
	}
}