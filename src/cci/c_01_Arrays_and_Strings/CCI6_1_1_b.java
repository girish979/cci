package cci.c_01_Arrays_and_Strings;

public class CCI6_1_1_b {
	
	static boolean isUnique(String str)
	{
		int xorValue = 0;
		for (int i=0;i<str.length();i++)
		{
			//gives 0->a; 1->b...
			int val = str.charAt(i) - 'a';
			if((xorValue & (1<<val)) > 0)
				return false;				
			xorValue |= 1<<val;
		}
		return true;
	}
	public static void main(String[] args) {
	
		//input is restricted to a-z
		System.out.println(isUnique("abcd"));
		System.out.println(isUnique("abcda"));
	}
}
