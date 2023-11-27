package practice;

public class PalidromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=454,sum=0,r,temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+"Palidrome Number");
		}
		else
		{
			System.out.println(temp+"Not Palidrome Number");
		}

	}

}
