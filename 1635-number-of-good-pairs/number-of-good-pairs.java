class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cnt=0;
        Map<Integer,Integer> map=new HashMap<>();

        for (int val: nums)
            map.put(val,map.getOrDefault(val,0)+1);

        for (Map.Entry<Integer,Integer> m: map.entrySet())
        {
            int n=m.getValue();
            int sum=(n*(n-1))/2;
            cnt+=sum;
        }

        return cnt;
    }
}