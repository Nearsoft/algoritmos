//The name of this fale must be change to Solution.java
class Solution {
    // The total complexity of this solution is O(n)
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length]; 
       
        int i = 0;  
        int j = nums.length-1;
        int k = nums.length-1;
        while(i<=j){ //This will iterate trough all the entries of the array O(n)
            
            if(Math.abs(nums[i]) <= Math.abs(nums[j])){ //Abs is a constant time operation
                result[k] = nums[j]*nums[j];
                j--;
            } else {
                result[k] = nums[i]*nums[i];
                i++;                
            }
            k--;
        }
        return result;
    }
}