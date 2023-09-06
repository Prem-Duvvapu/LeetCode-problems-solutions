//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
            }
            Solution obj = new Solution();
            int ans = obj.findMotherVertex(V, adj);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        boolean[] visited=new boolean[V];
        int ans=-1;
        
        for (int i=0;i<V;i++)
        {
            if (!visited[i])
            {
                dfs(i,visited,adj);
                ans=i;
            }
        }
        
        boolean[] v2=new boolean[V];
        dfs(ans,v2,adj);
        
        for (boolean b: v2)
            if (!b)
                return -1;
                
        return ans;
    }
    
    private void dfs(int node,boolean[] visited,ArrayList<ArrayList<Integer>> adj)
    {
        visited[node]=true;
        
        for (int neighbour: adj.get(node))
            if (!visited[neighbour])
                dfs(neighbour,visited,adj);
    }
}