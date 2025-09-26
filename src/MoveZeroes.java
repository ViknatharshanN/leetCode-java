class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) nums[insertPos++] = num;
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes z = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        z.moveZeroes(nums);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
