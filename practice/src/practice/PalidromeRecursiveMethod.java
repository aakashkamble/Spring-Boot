package practice;

public class PalidromeRecursiveMethod {
	public static void PalidromeNum(int num)
	{
		int sum=0,temp;
		temp=num;
		while(num>0)
		{
			int remainder=num % 10;
			sum=sum*10+remainder;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+"is a Palidrome Number");
		}
		else
		{
			System.out.println(temp+"is not a palidrome Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PalidromeNum(453);
	}

}
