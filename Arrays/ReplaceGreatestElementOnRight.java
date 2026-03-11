class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n=arr.length;
        int num[]=new int[n];
        num[n-1]=-1;
        int ind=0;
        for(int i=0;i<arr.length-1;i++){
           int max=Integer.MIN_VALUE;
           for(int j=i+1;j<arr.length;j++){
            max=Math.max(max,arr[j]);
           }
           num[ind++]=max;
        }
        return num;
    }
}
