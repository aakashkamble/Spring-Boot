package practice;

public class NumberRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int rev=0;
		while(num!=0)
		{
			int remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		System.out.println("Reverse Number is:"+rev);

	}

}
