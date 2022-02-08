class Solution {
    //O(n) solution.
    //Floyd's cycle-finding algorithm: Hare and tortoise..
    //The tortoise will move at half the speed of the hare..
    //at a certain point of time, the hare and the tortoise meets..
    //but that's not the point of cycle entrance..
    //To compute the intersection point, let's note that the hare has traversed twice as many nodes as the tortoise, i.e. 2d(tortoise)=d(hare), implying:

//2(F + a) = F + nC + a..=> it gives...F+a=nC=>a=nC-F
    //now if turtle and hare speed are made same and turtle is made to move F steps ahead..from 0th index..turtle will be at the F th point or the point of cycle entrance..
    //and hare will be at a+F=(nC-F)+F=nC..
    //so they will be meeting at the entrance point of cycle..
    //
    //Further explanation:https://leetcode.com/problems/find-the-duplicate-number/solution/
    
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        if(n>1){
            int slow=nums[0];
            int fast=nums[nums[0]];
            while(slow!=fast){
                slow=nums[slow];
                fast=nums[nums[fast]];
                
            }
            slow=0;
            while(slow!=fast){
                slow=nums[slow];
                fast=nums[fast];
            }
            
            return slow;
            //or return fast
            
        }else{
            return -1;
        }
    }
}
