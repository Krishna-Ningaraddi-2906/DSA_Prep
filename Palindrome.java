public class Palindrome 
{
public static void main(String[] args)
  {
    String str="gadag";
    System.out.println(validPalindrom(str));
  }    

     static boolean validPalindrom(String str)
    {
         str=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

         int left=0,right=str.length()-1;

         while(left<right)
         {
            if(str.charAt(left)!=str.charAt(right))
                return false;
                left++;
                right--;
         }

         return true;
         

    }
}
