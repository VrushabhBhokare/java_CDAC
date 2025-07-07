package ass5;

public class Palindrome {
	public static void main(String[] args) 
	{
		String st="ABCDEFG";
		StringBuilder strs = new StringBuilder(st);
		strs.reverse();
		String ne=strs.toString();
		if(st==ne) {
			System.out.print("its a palindrome");
		}
		else
		{
			System.out.print("its not palindrome");

		}
		
		/*char[]str=st.toCharArray();
		boolean flag=false;
		for(int i=0, j=str.length-1;i<j;i++,j--) {
			if(str[i]==str[j])
			{
				flag=true;
			}		
		}
		if(flag==true) {
			System.out.print("its a palindrome");
		}
		else {
			System.out.print("not a palindrome");
		}
		
	
	
	
		*/
}}