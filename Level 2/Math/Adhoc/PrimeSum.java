public class Solution{
    private boolean primes[];
    
    public ArrayList<Integer> primesum(int n){
        ArrayList<Integer> p = getPrimes(n);
        ArrayList<Integer> result;
        for(int i = 0; i < p.size(); i++){
            for(int j = i; j < p.size(); j++){
                if(p.get(i) + p.get(j) == n){
                    result = new ArrayList<Integer>();
                    result.add(p.get(i));
                    result.add(p.get(j));
                    return result;
                }
            }
        }
        return null;
    }
    
    private ArrayList<Integer> getPrimes(int n){
        fillSieve(n);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++){
            if(primes[i]){
                list.add(i);
            }
        }
        return list;
    }
    
    private void fillSieve(int n){
        primes = new boolean[n + 1];
        for(int i = 0; i <= n; i++){
            primes[i] = true;
        }
        primes[0] = false;
        primes[1] = false;
        int sqrt = (int)Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++){
            if(primes[i] == true){
                for(int j = 2; i * j <= n; j++){
                    primes[i * j] = false;
                }
            }
        }
    }
}