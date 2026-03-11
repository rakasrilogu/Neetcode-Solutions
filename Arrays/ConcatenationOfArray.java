class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int in[]=new int[2*n];
        int ind=0;
        for(int i=0;i<n;i++){
           in[i]=nums[i];
           in[n+i]=nums[i];
        }
        return in;
    }
}
