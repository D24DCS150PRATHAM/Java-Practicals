public class p8
{
    public static void main(String[] args)
    {
        int[] nums1 = {1, 2, 9,};
        int[] nums2 = {1, 9, 9};
        int[] nums3 = {1, 9, 9, 3, 9};

        System.out.println("Number of 9's in nums1: " + arrayCountNines(nums1));
        System.out.println("Number of 9's in nums2: " + arrayCountNines(nums2));
        System.out.println("Number of 9's in nums3: " + arrayCountNines(nums3));
    }

    public static int arrayCountNines(int[] nums)
    {
        int count = 0;
        for (int num : nums)
        {
            if (num == 9)
            {
                count++;
            }
        }
        return count;
    }
}
