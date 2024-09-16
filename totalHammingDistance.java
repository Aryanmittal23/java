class Solution {
    public int totalHammingDistance(int[] nums) {
        int totalDistance = 0;
        int n = nums.length;
        for (int bit = 0; bit < 32; bit++) {
            int countOnes = 0;
            for (int num : nums) {
                countOnes += (num >> bit) & 1;
            }
            int countZeroes = n - countOnes;
            totalDistance += countOnes * countZeroes;
        }
        return totalDistance;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 14, 2};
        System.out.println("Total Hamming Distance: " + solution.totalHammingDistance(nums));  
    }
}