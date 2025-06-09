import java.util.*;
public class Validparantesis 
{
    public static void main(String[] args) 
    {

        Scanner sc= new Scanner(System.in);        
        System.out.println("Enter the String");
        String str= sc.next();
        System.out.println(parantesis(str));
        sc.close();
    }

    public static boolean parantesis(String str) 
    {
       Stack<Character> stack= new Stack<>();
        char[] sa= str.toCharArray();

        for(char i:sa)
        {
            if(i=='(')
                stack.add(')');
            else if(i=='[')
                stack.add(']');
            else if(i=='{')
                stack.add('}');
            else if(stack.isEmpty()|| stack.pop()!=i)

                return false;
        }

        return stack.isEmpty();        

    }
    
}
