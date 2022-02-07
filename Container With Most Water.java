//https://leetcode.com/problems/container-with-most-water/
class Solution {

    //O(n)
    
    //Logic:
    //Start with the maximum width container and go to a shorter width container if there is a vertical line longer than the current containers shorter line.
    //This way we are compromising on the width but we are looking forward to a longer length container.
    
    public int maxArea(int[] height) {
        
        int n=height.length;
        int i=0;
        int j=n-1;
        long area=0;
        long max=0;
        
        while(i<j){
            
            int ht=Math.min(height[i],height[j]);
            area=ht*(j-i);
            
            max=Math.max(area,max);
            while(i<n&&height[i]==ht){
                ++i;
            }
            while(j>=0&&height[j]==ht){
                --j;
            }
        }
        
        return (int)max;
        
    }
}
