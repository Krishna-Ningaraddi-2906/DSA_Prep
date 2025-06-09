import java.util.*;

public class ValidAnagram 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1");
        String string1=sc.next();
        System.out.println("Enter the String 2");
        String string2=sc.next();
        if(Anagram(string1,string2))
            System.out.println("It's a valid anagram");
        else
            System.out.println("Not a valid anagram");
        sc.close();
    }

     static boolean Anagram(String string1, String string2)
      {
        if(string1.length()!=string2.length())
            return false;

        char[] arr1=string1.toCharArray();
        char[] arr2=string2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

      }
}
