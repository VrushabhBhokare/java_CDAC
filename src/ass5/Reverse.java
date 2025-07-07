package ass5;

public class Reverse {
	public static void main(String[] args)
 {

	String st="ABCDEFG";
	StringBuilder strs = new StringBuilder(st);
	strs.reverse();
	String ne=strs.toString();
	System.out.print(ne);

	
	/*char[]str=st.toCharArray();
	{
	
		for(int i=0, j=str.length-1;i<j;i++,j--) 
		{
			char temp=str[i];
			str[i]=str[j];
			str[j]=temp;
		}
	    for(int i=0;i<str.length;i++) 
	    {
	    	System.out.print(str[i]);
		
	    }
	}*/

 }
}
