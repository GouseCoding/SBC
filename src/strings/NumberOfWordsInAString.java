package strings;

public class NumberOfWordsInAString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s = "This is a string";
		
		String[] arrOfStr = s.split("\\s");
		
		 int totalWord = arrOfStr.length;
		 
		 System.out.println("Total words :"+  totalWord);
	
	}
}
