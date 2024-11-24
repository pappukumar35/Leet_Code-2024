class Minimum_Number_of_Operations_to_Make_Array_Empty {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);

        int res = 0;
        int s = 0;
        while (s < nums.length) {
            int e = s;

            while (e < nums.length && nums[e] == nums[s]) {
                e++;
            }
            int count = e - s;
            if (count == 1)
                return -1;
            res += count / 3;

            if (count % 3 != 0)
                res++;
            s = e;
        }
        return res;

    }
}