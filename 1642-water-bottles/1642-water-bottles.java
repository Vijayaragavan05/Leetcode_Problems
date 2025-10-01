class Solution {
    public int numWaterBottles(int numB, int numE) {
      int em=0;
      int eb=0;
      while(numB>0){
        em+=numB;
        eb+=numB;
        numB=eb/numE;
        eb=eb%numE;
      }
      return em;
    }
}