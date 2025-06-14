class Solution {
    private String ans="";
    public void expand(String s, int left ,int right){
        while(left>=0 && right<=s.length()-1){
            if(s.charAt(left)!=s.charAt(right)){
                break;
            }
            left--;
            right++;
        
        if (ans.length() < right - left - 1) {
            ans = s.substring(left + 1, right); 
        }
        }
    }
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return ans;
    }
}