class TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] a = new int[2];
        int i, j;
        for(i=0; i<nums.length; )
        {
            for(j=i+1; j<nums.length; j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    a[0]=j;
                    a[1]=i;
                }
            }
            i++;
        }
        return a;
    }
}