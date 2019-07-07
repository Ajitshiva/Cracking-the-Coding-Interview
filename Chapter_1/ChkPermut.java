/*
1.2
Check Permutation: Given two strings, write a method to decide if one is a permutation of the
other
*/
class ChkPermut 
{
    static Boolean check_permut(String s1,String s2)
    {
        if(s1.length()!=s2.length())
            return false;
        else
            {
                int hashS1[] = new int[126];
                for(int i =0;i<s1.length();i++)
                {
                    int ascii = (int) s1.charAt(i);
                    hashS1[ascii]++;
                    int ascii1 = (int) s2.charAt(i);
                    hashS1[ascii1]--;
                }
                for(int i=0;i<hashS1.length;i++)
                {
                    if(hashS1[i]!=0) return false;
                }
                return true;
            }
    }
    public static void main(String args[])
    {
        String s1 = "Ajit";
        String s2 = "Ajit";
        if(check_permut(s1,s2)) 
        {System.out.println("Both Strings are Permutation to each other");}
        else 
        {System.out.println("Both Strings are not Permutation to each other");}
    }
}
/*
OUTPUT
Both Strings are Permutation to each other

*/