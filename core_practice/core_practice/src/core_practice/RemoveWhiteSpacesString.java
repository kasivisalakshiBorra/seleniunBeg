package core_practice;

public class RemoveWhiteSpacesString {

	public static void main(String[] args) {
		
		String Str ="Hello   Engin     eer Ho w  Are y ou";
		//remove whitespaces Using replaceall().
//		String Str2= Str.replaceAll("\\s", "");
//		System.out.println(Str2);
		
		//without replace all how to remove white spaces.
		char Chars[]= Str.toCharArray();
		String b= "";
		
		for(int i=0;i<=Chars.length-1;i++)
		{
			if((Chars[i]!= ' ')&&(Chars[i]!='\t'))//\t-tabspaces nealy 6spcaes
					{
					 b= b+Chars[i];        
					}
		}
		System.out.println("printing  " +b);
	}
	
	
	
}
