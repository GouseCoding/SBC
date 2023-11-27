package strings;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String original = "deepak";
		String  rev= " ";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			rev+= original.charAt(i);
		}
		
		System.out.println(rev);
		
		if(rev.equals(original))
		{
			System.out.print("Palindrome");
		}
		else
		{
			System.out.print("Not palindrome");
		}

	}
}
