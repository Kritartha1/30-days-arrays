class Solution {
   //O(nlogn) solution..
    //though seems O(n) but its O(nlogn)..
    //Explanation: //leetcode.com/problems/find-the-duplicate-number/discuss/72872/O(32*N)-solution-using-bit-manipulation-in-10-lines
    
    public int findDuplicate(int[] nums) {
        int n=nums.length-1;
        int ans=0;
        for(int m=0;m<32;m++){
            int bit=1<<m;
            int a=0;
            int b=0;
            for(int i=0;i<=n;i++){
                if(i>0&&(i&bit)>0){
                    ++a;
                }
                if((nums[i]&bit)>0){
                    ++b;
                }
            }
            if(b>a){
                ans+=bit;
            }
        }
        return ans;
    }
}
