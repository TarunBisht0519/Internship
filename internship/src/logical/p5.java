//Moving Zeros to end: Given an array of n integers, move all zeros of a given array to the end of the array. 
//For example, if the given array is { 1,9,8,4,0,0,2,7,0,6,0}, it should be changed to {1,9,8,4,2,7,6,0,0,0,0}. 
//The order of all other elements should be same.
package logical;
import java.util.*;
public class p5 
{
	public static void main(String[] args)
	{
		int [] arr=new int[]{ 1,9,8,4,0,0,2,7,0,6,0};
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int x:arr)
		{
			list.add(x);
		}
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==0)
			{
				int x=list.get(i);
				list.remove(list.get(i));
				list.add(list.size()-1, x);
			}
		}
		System.out.println(list.toString());
	}

}
