class Solution {
    public int maxArea(int[] height) {
        if(height.length==0 || height.length==1){
            System.out.println("empty water tank");
        }
        int maxarea=0;
        int area;
        int i=0;
        int j=height.length-1;
        while(i<j){
            area=Math.min(height[i],height[j])*(j-i);
            maxarea=Math.max(maxarea,area);
           
                    if(height[i]>height[j]){
                     j--;
                    }
                     else{
                     i++;
                 }
        }
        return maxarea;
        
    }
}