//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        int start=bSearch(arr,x,0,n-1);
        if (start==n || arr[start]!=x)
            return 0;
        int end=bSearch(arr,x+1,start,n-1);
        return (end-start);
    }
    
    int bSearch(int[] arr,int x,int left,int right)
    {
        while (left<=right)
        {
            int mid=left+(right-left)/2;
            if (arr[mid]<x)
                left=mid+1;
            else
                right=mid-1;
        }
        return left;
    }
}

//TC:- O(logn)