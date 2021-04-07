public class Palindrome{
    public static boolean is_palindrome(String s)
    {
   int i; boolean mot=true; int end=s.length();
    for (i = 0; i < end/2; i++){
    if(s.charAt(i)!=s.charAt(end-1-i))
    {mot = false;}}
    return mot;

       
    }
}