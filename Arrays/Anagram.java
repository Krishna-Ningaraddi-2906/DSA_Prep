public class Anagram 
{
    public static void main(String[] args) {
        String s="gadag";
        String t="ggdag";
        
        System.out.println(validAnagram(s, t));

 
    
    }

    public static boolean validAnagram(String s, String t)
    {
        int[] arr= new int[26];
            if(s.length()!=t.length())
                return false;
            
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++)
        {
            arr[t.charAt(i)-'a']--;

            if(arr[t.charAt(i)-'a']<0)
                return false;
        }

        return true;
    } 
    
}
