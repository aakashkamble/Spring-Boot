package practice;

public class FactorialRecursiveMethod {
	public static void factNum(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(num + "Factorial Number is: "+fact);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factNum(5);

	}

}
