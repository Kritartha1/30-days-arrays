class Solution {
    //leetcode.com/problems/merge-sorted-array/submissions/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //Logic: insert the elements in the nums1 array from the last position onwards..
        //also compare elements from the back of both the arrays..
        //and decrement indexes wherever necessary..
        //code is self explanatory
        
        int max=Math.max(m>0?nums1[m-1]:0,n>0?nums2[n-1]:0);
        max=max+1;
        
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
        while(i>=0&&j>=0){
            
            if(nums1[i]>nums2[j]){
                
                nums1[k--]=nums1[i--];
                
            }
            else{
                
                nums1[k--]=nums2[j--];
                
            }
        }
        
        //there may be some left over in the nums2 array after the iteration..
        //so inserting those elements to the start of the nums1 array..
        //why nums1 left over is not taken into account?
        //bcoz, nums1 left over is already in the nums1 array which is the answer..
        //so we don't have to look for nums1 once the previous iteration was completed..
        while(j>=0){
            
            nums1[k--]=nums2[j--];
        }
        
    }
}
