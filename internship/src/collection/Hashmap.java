package collection;
import java.util.*;
public class Hashmap 
{
    static HashMap<Character,Integer>map=new HashMap<Character,Integer>();
    public static void frequency(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), 1);
            }
            else
            {
                map.replace(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        for(Map.Entry<Character, Integer>entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
           
        }
        
    }
    public static void max()
    {
        int maximum=0;
        Character c=' ';
        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {
            if(entry.getValue()>maximum)
            {
                maximum=entry.getValue();
                c=entry.getKey();
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE WORD ");
        String s=sc.nextLine();
        frequency(s);
        System.out.println("THE MAXIMUM REPEATING CHARACTER IS ");
        max();
    }

}
