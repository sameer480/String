class Solution {
    public int[] twoSum(int[] number, int target) {
     int n=number.length;
     int i=0;
     int j=n-1;
     while(i<j){
        int sum=number[i]+number[j];
        if(sum==target){
            return new int [] {i+1,j+1};
        }
        if(sum>target){
            j--;
        }else{
        i++;
        }
     }
     return new int [] {-1,-1};

        
    }
}