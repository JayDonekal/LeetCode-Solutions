
public class Palindrome {
	public String palindrom (String x) {
			String rev = "";
				for (int j=x.length()-1; j>=0; j--){
					rev = rev + x.charAt(j);
					}
		return rev;
	}
	
	
	public static void main (String args[]) {
		Palindrome obj = new Palindrome();
		String s = "carl";
		String rev = obj.palindrom(s);
		if(rev.equals(s)) 
		{
			System.out.print("Palindrom \n");
		}
		else
		{
			System.out.print("Not Palindrom \n");
		}
	}
}
