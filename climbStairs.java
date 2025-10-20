class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
       
       int a=0;
        int b=1;
        int c=2;
       for(int i=3;i<=n;i++)
       {  a=b;
          b=c;
          c=b+a;
       } 
       return c;
    }
}
