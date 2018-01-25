package cci.c_01_Arrays_and_Strings;

public class CCI6_1_1_a {
	
	static boolean isUnique(String str)
	{
		boolean[] bvector = new boolean[128];
		
		for (int i=0;i<str.length();i++)
		{
			if(bvector[str.charAt(i)])
			{
				return false;
			}
			bvector[str.charAt(i)] = true;
		}
		return true;
	}
	public static void main(String[] args) {
	
		System.out.println(isUnique("abcd"));
		System.out.println(isUnique("abcda"));
	}
}
