import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int max = nums.length/2;
        int answer = 0;

        Set set = new HashSet();
        
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        
        int size = set.size();
        
        if(size > max) {
            answer = max;
        } else {
            answer = size;
        }
        return answer;
    }
}