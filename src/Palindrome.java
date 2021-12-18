
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "madam";
		String t = "";		// Empty string is created to hold the value of reversed string array
		for (int i = s.length()-1;i>=0;i--)
		{
			t= t+ s.charAt(i);  // normal array can be stored by using s[i], but in case of string it needs to stored by using charAt(i) index.
		}
		
		System.out.println(t);
		
		if(t==s)
		{
			System.out.println("This is a Palindrome");
		}
		else
		{
			System.out.println("This is not a palindrome");
		}
	}

}
