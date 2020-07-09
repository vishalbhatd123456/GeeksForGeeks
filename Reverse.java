class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        
        return sb.toString();
    }
}
