public class Solution{
	public int titleToNumber(String s){
	    int result = 0, base = 26;
        for(int i = 0; i < s.length(); i++){
            result = result * base + (s.charAt(i) - 'A' + 1);
        }
        return result;
	}
}