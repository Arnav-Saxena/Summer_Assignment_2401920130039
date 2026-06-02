class ContainsDuplicate
{
    public boolean containsDuplicate(int[] nums)
    {
        Arrays.sort(nums);
        int i; boolean result=false;
        for(i=0; i<nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                result=true;
            }
        }
        return result;
    }
}