import java.util.*;
class Mergesort
{
	public static void main(String args[])
	{
		Random r=new Random();
		System.out.println("Enter number of elements: ");
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int a[]=new int[n];
				for(int i=0;i<n;i++)
					a[i]=r.nextInt(100);
				System.out.println("Elements before sort: ");
				for(int i=0;i<n;i++)
					System.out.println(a[i]);
				double t1=System.nanoTime();
				Mergesort(a,0,n-1);
				double t2=System.nanoTime();
				System.out.println("Elements after sort:");
				for(int i=0;i<n;i++)
					System.out.println(a[i]);
				System.out.println("Time taken is :");
				System.out.println(t2-t1);
		sc.close();
	}
	public static void Mergesort(int a[],int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			Mergesort(a,low,mid);
			Mergesort(a,mid+1,high);
			Merge(a,low,high,mid);
		}
	}
	public static void Merge(int a[],int low,int high,int mid)
	{
		int h=low,k;
		int i=low,j=mid+1;
		int b[]=new int[high+1];
		while(h<=mid&&j<=high)
		{
			if(a[h]<=a[j])
			{
				b[i]=a[h];
				h=h+1;
			}
			else
			{
				b[i]=a[j];
				j=j+1;
			}
			i=i+1;
		}
		if(h>mid)
			for(k=j;k<=high;k++)
			{
				b[i]=a[k];
				i=i+1;
			}
		else
			for(k=h;k<=mid;k++)
			{
				b[i]=a[k];
				i=i+1;
			}
		for(k=low;k<=high;k++)
			a[k]=b[k];
	}
}