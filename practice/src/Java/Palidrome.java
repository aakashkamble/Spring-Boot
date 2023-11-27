package Java;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=454,sum=0,temp;
		temp=num;
		while(num>0)
		{
			int r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+"is a Palidrome");
		}
		else
		{
			System.out.println(temp+"is not a Palidrome");
		}
	}

}
