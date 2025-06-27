class Solution5 {
    public void rotate(int[] nums, int k) {
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(a==k)
                break;
            nums[nums.length-1-i]= nums[i]+nums[nums.length-1-i]-(nums[i]=nums[nums.length-1-i]);
            k++;
        }
    }
}