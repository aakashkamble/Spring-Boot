package practice;

public class NumberRevRecursiveMethod {
	
	public static void StrNum(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int remainder=num % 10;
			rev=rev*10+remainder;
			num=num/10;
		}
		System.out.println("Reverse Number is:"+rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrNum(12345);

	}

}
