import java.util.*;
public class Twosum 
{
    public static void main(String[] args) 
    {
        int[] arr= {1,2,4,5,3,5,1};
        int target=10;

        int[] sol=twoSum(arr, target);

        System.out.println(Arrays.toString(sol));

    }

 
       public static int[] twoSum(int[] nums, int target) 
       {
       HashMap<Integer, Integer> map= new HashMap<>();

       for(int i=0;i<nums.length;i++)
       {
        int ref = target-nums[i];

        if(map.containsKey(ref))
            return new int[]{map.get(ref),i};
        map.put(nums[i],i);
       }

       return new int[]{};
    }

    
    }
