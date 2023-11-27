package strings;

public class MaxRepeatedchar 
{
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	  String  s = "this is demo abc xyz";
	  
	   //Remove spaces
	  s =s.replaceAll("\\s", "");
	  System.out.println(s);
	  
	  int[] arr = new int[127];
	  for(int i=0;i<s.length()-1; i++)
	  {
		  arr[s.charAt(i)] = arr[s.charAt(i)] +1;	  
	  }
	  
	  int max = -1;
	  char c =' ';
	  int count =0;
	  for(int i=0;i<s.length();i++)
	  {
		  if(arr[s.charAt(i)]>max)
		  {
			  max = arr[s.charAt(i)];
			  c=s.charAt(i);
			  count++;
		  }
	  }
	  
	  System.out.print("max repeated char is:"+ c +" & it is repeated for  "  +  count  +" times ");
	  
	  
	  
	 
	}
}
