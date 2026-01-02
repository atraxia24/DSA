package functions;
class Solution {
    public static int repeatedNTimes(int[] nums) {
        int count = 0;
        int check;
        for(int i = 0; i<nums.length; i++){
            check = nums[i];
            for(int j = i+1; j<nums.length; j++){
                if(nums[j] == check)
                    return check;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {6,9,6,3,6,4,8,6};
        int ans = repeatedNTimes(arr);
        System.out.println(ans);
    }
}