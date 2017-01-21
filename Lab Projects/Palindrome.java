package labprojects;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("noon"));
		System.out.println(isPalindrome("Madam I'm Adam"));
		System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
		System.out.println(isPalindrome("A Toyota"));
		System.out.println(isPalindrome("Not a palindrome"));
		System.out.println(isPalindrome("asdfghfdsa"));
	}

	public static boolean isPalindrome(String in) {
		if(in==null) {
			return false;
		}
		return isPalindromeHelper(in.toUpperCase());
	}

	private static boolean isPalindromeHelper(String in) {
		// Fill me in
		int length = in.length();
		
		if(length <= 1){
			return true;
		}
		else{
			char first = in.charAt(0);
			char last = in.charAt(length-1);
			
			if(!Character.isLetter(first)){
				return isPalindromeHelper(in.substring(1));
			}
			else if(!Character.isLetter(last)){
				return isPalindromeHelper(in.substring(0, length-1));
			}
			else if(first == last){
				return isPalindromeHelper(in.substring(1, length-1));
			}
		}
		return false;

	}
}


