class Solution {
    public int scoreOfString(String s) {
        int arr[]=new int[s.length()];
        int ind=0;
        for(int i=0;i<s.length();i++){
            arr[ind++]=(int)s.charAt(i);
        }
        int sum=0;
        for(int i=1;i<arr.length;i++){
            int diff=Math.abs(arr[i]-arr[i-1]);
            sum=sum+diff;
        }
        return sum;
    }
}
