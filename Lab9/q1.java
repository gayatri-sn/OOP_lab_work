import java.util.Scanner;
public class string1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int count_words=0,count_vowels=0;
        String vowels="AEIOUaeiou";
        System.out.println("enter the string");
        String s1=sc.nextLine();
        char  c[]=s1.toCharArray();  //converts string to array of char
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<vowels.length();j++)
            {
                if(c[i]=='a' || c[i]=='e' || c[i]=='i'||c[i]=='o'||c[i]=='u')
                {
                  count_vowels++;   //counts total vowels
                  break;
                }
            }
        }
        System.out.println("Characters:"+s1.length());  //display characters
        String words[]= s1.split(" ");  //splits each word
        for(String word: words)
        {
            count_words++;  //counts the number of words
        }
        System.out.println("Words: "+count_words);
        int line=s1.split("\r\n|\r|\n").length;  //count lines
        System.out.println("Lines: "+line); 
        System.out.println("Vowels: "+count_vowels);
        sc.close();
    }
}
