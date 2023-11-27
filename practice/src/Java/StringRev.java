package Java;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		String s=" ";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			s=ch+s;
		}
		System.out.println("String Reverse: "+s);

	}

}
