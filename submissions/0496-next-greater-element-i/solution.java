

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // stores next greater element
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 from left to right
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num); // num is next greater for top of stack
            }
            stack.push(num);
        }

        // For elements with no next greater, they remain unmapped -> we return -1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}

