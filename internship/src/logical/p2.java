//QUESTION2->Copy the following array into two arrays. Array 1 should only contains numbers. Array two – only special characters.
//Array - {‘3’,’2’,’*’,’#’,’7’,’8’,’$’,’5’&,’9’}

package logical;
import java.util.*;
import java.util.regex.Pattern;
public class p2 
{
	public static void main(String[] args) 
	{
		String [] arr=new String[] {"3","2","*","#","7","8","$","5","&","9"};
		ArrayList<String>a1=new ArrayList<String>();
		ArrayList<String>a2=new ArrayList<String>();
		for(int i=0;i<arr.length;i++)
		{
			if(Pattern.matches("[1-9]", arr[i]))
			{
				a1.add(arr[i]);
			}
			else
			{
				a2.add(arr[i]);
			}
		}
		System.out.println("ARRAY1"+a1.toString());
		System.out.println("ARRAY2"+a2.toString());
		
	}

}
