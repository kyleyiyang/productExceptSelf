class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
        int[] temp2=new int[nums.length];
        output[0]=1;
        temp2[nums.length-1]=1;
        for (int j=1;j<nums.length;j++) {
            output[j]=output[j-1]*nums[j-1];
            temp2[nums.length-j-1]=temp2[nums.length-j]*nums[nums.length-j];
        }
        for (int i=1;i<nums.length-1;i++) {
            output[i]=output[i]*temp2[i];
        }
        output[0] = temp2[1]*nums[1];
        return output;
    }
}
