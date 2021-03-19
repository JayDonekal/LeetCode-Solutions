import java.util.Arrays;

class Twosum1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                int comp = target - nums[i];
                
                if (comp == nums[j])
                {
                    return new int[] {i,j};
                }
            }
            
        }
        	throw new IllegalArgumentException("no match found");

    }

    public static void main(String args[]) {
    int[] nums = {2,5,7,11};
    int target = 9;
    
   	 Twosum1 twosum1 = new Twosum1();
   	 
   	 System.out.println(Arrays.toString(twosum1.twoSum(nums, target)));
    }
}
