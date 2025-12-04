class Solution {
    public int memo(int [] cost,int i,int [] m){
        if(i>= cost.length){
            return 0;
        }
        if(m[i]!=-1){
            return m[i];
        }
        int one=cost[i]+memo(cost,i+1,m);
        int two= cost[i]+memo(cost ,i+2,m);
        return Math.min(one,two);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        int [] dp= new int[n];
        Arrays.fill(dp,-1);
       // You can start from step 0 or step 1
        return Math.min( memo( cost,0, dp),
                         memo(cost,1, dp) );
        
    }
}