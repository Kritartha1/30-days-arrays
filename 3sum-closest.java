class Solution {
    
    //two pointer approach
    //leetcode.com/problems/3sum-closest/submissions/
    
    int diff=Integer.MAX_VALUE;
    
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int n=nums.length,j=0,k=0,ans=target,currDiff=0;
        
        for(int i=0;i<n-2;i++){
            
            j=i+1;
            k=n-1;
            
            int currSum=nums[i];
            
            while(j<k){
                
                currSum+=nums[j]+nums[k];
                
                currDiff=Math.abs(currSum-target);
                
                if(currDiff<diff){
                    
                        diff=currDiff;
                        ans=currSum;
                   
                }
                
                if(currSum==target){
                    
                    return target;
                }
                else if(currSum>target){
                    
                    currSum-=(nums[j]+nums[k--]);
                    
                }else{
                    
                    currSum-=(nums[j++]+nums[k]);
                }
            }
        }
        
        return ans;
    }
}
