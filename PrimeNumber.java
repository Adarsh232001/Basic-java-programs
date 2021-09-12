import java.util.*;

class PrimeNUmber
{
	public static void main(String args[])
	{
		System.out.println("Enter to number to find wheter it is a Prime or Not");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1||num==2)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			if(num%2==1)
			{
				System.out.println("It is a prime number");
			}
			else
			{
				System.out.println("It is not a prime number");
			}
		}
		sc.close();
	}
}