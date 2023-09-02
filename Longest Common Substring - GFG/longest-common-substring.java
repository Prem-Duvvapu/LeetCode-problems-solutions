//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String s1, String s2, int n, int m){
        int[] prev=new int[m+1];
        int[] curr=new int[m+1];
        int maxLen=0;
        
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=m;j++)
            {
                if (s1.charAt(i-1)==s2.charAt(j-1))
                {
                    curr[j]=1+prev[j-1];
                    maxLen=Math.max(maxLen,curr[j]);
                }
                else
                    curr[j]=0;
            }
            
            for (int k=1;k<=m;k++)
                prev[k]=curr[k];
        }
        
        return maxLen;
    }
}