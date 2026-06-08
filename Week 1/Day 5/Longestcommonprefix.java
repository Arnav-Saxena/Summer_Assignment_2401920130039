class Longestcommonprefix
{
    public String longestCommonPrefix(String[] strs) 
    {
        Arrays.sort(strs, (a, b) -> a.length() - b.length());
        String result = ""; int c = 0;
        for(int i = 0; i < strs[0].length(); i++)
        {
            c=0;
            for(int j = 1; j < strs.length; j++)
            {
                if(strs[0].charAt(i)==strs[j].charAt(i))
                {
                    c++;
                }
                else
                {
                    break;
                }
            }
            if(c==strs.length-1)
            {
                result = result + strs[0].charAt(i);
            }
            else break;
        }
        return result;
    }
}