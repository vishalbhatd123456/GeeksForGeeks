// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            String st = sc.next();
            if(new Parenthesis().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}// } Driver Code Ends


class Parenthesis
{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
        // add your code here
        char[] str = x.toCharArray();
    Stack<Character> stack = new Stack<>();
    
    for(int i=0;i<str.length;i++)
    {
    //push the opening ones, i mean all of them into the stack
        if(str[i] == '('||str[i] == '{'|| str[i] == '[')
        {
            stack.push(str[i]);
        }
        else
        {
            if(stack.isEmpty())
            return false;
            else if(isMatching(stack.peek(),str[i]) == false)
            {
                return false;
            }
            else
            {
                stack.pop();
            }
            
        }
       
        
    }
     return (stack.isEmpty() == true);
    
}

static boolean isMatching(char a, char b)
{
    return ((a=='(' && b==')') ||(a=='{' && b=='}')||(a=='[' && b==']'));
}
}
