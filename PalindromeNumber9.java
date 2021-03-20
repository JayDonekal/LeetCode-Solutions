
public class PalindromeNumber9 {
 public boolean isPalindrome(int x) {
	 boolean success= true;
	 int rev = 0;
	 int y = x;
	 while (x!=0) {
		 int pop = x%10;
		 x/=10;
		 
		 rev = rev*10 + pop;
	 }
     if (rev == y && y>=0) {
    	 success = true;
     }
     else {
    	 success = false;
     }
	 
	 
	 return success;
    }
 
 public static void main (String args[]) {
	 PalindromeNumber9 obj = new PalindromeNumber9();
 	System.out.print(obj.isPalindrome(121));
 }
}



