class Solution {
    public int twoEggDrop(int n) {
        int minimumNumberOfMoves = 0;
        
        while(n > 0){
            n -= minimumNumberOfMoves++;
        }
        return minimumNumberOfMoves - 1;
    }
}
