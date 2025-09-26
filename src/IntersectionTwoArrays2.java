import java.util.*;

class IntersectionTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) map.put(num, map.getOrDefault(num, 0) + 1);
        List<Integer> res = new ArrayList<>();
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                res.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) ans[i] = res.get(i);
        return ans;
    }

    public static void main(String[] args) {
        IntersectionTwoArrays2 intersectionTwoArrays2 = new IntersectionTwoArrays2();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] res = intersectionTwoArrays2.intersect(nums1, nums2);
        for (int n : res) System.out.print(n + " ");
    }
}
