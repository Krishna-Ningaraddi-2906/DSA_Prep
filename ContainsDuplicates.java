import java.util.*;
public class ContainsDuplicates 
{

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }

        if(duplicate(nums))
            System.out.println("Contains Duplicates");
        else
            System.out.println("Do not contain Duplicates");

        sc.close();
    }

     static boolean duplicate(int[] nums) 
     {
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums)
        {
            if(set.contains(num))
                return true;
            set.add(num);
        }
        return false;
     }
    
}
