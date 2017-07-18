public class Solution{
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y){
        int moves = 0, x1 = X.get(0), y1 = Y.get(0), x2, y2;
        for(int i = 1; i < X.size(); i++){
            x2 = X.get(i);
            y2 = Y.get(i);
            moves += Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));
            x1 = x2;
            y1 = y2;
        }
        return moves;
    }
}