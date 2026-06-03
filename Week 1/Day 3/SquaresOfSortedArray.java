class SquaresOfSortedArray
{
    public int[] sortedSquares(int[] nums) 
    {
        int n=nums.length;
        int sq[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            sq[i] = nums[i]*nums[i];
        }
        Arrays.sort(sq);
        return sq;
    }
}