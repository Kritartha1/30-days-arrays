class Solution {
//leetcode.com/problems/find-the-duplicate-number/
    //It's basically a pigeon hole problem..
    //holes <=n--> pigeons=n+1 ..so definitely...some holes should have two or more pigeons..
    
    //O(nlog(n))
    
    public int findDuplicate(int[] nums) {
        
        int l=1;
        int r=nums.length-1;
        
        while(l<r){
            
            int mid=l+(r-l)/2;
            
            int count=0;
            
            for(int ele:nums){
                
                if(ele<=mid){
                    count+=1;
                }
            }
            //count means pigeons..
            //mid is holes till (l+r)/2..
            //so if pigeons count is greater than holes..
            //so that half part from l to (l+r)/2 must contain two or more pigeons..
            //so redefining the boundaries...
            
            if(count<=mid){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        //bcoz at last step count will be greater than mid..
        //so r will tend to decrease ..then  it will become..r<l..
        //and we all know that at final moment, l will have the answer..
        return l;
    }
}
