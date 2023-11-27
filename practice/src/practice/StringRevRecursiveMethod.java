package practice;

public class StringRevRecursiveMethod {
	public static void StringRev(String str)
	{
		String s="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			s=ch+s;
		}
		System.out.println("String Reverse:"+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRev("Hello");

	}

}
