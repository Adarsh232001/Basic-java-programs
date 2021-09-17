import java.util.*;
class RandomThread implements Runnable
{
public void run()
{
int num;
Random r=new Random();
try 
{
for(int i=0;i<5;i++)
{
num=r.nextInt(100);
System.out.println("First Thread started and generated Number is "+num);
Thread.sleep(100);
}
}
catch(Exception ex)
{
System.out.println(ex.getMessage());
}
}
}
class square implements Runnable
{
public int x;
public square(int x)
{
this.x=x;
}
public void run()
{
System.out.println("From Second Thread- Square of "+x*x);
}
}
class cube implements Runnable
{
public int x;
public cube(int x)
{
this.x=x;
}
public void run()
{
System.out.println("From Third Thread - Cube of"+x*x*x);
}
}
class MultiThread 
{
public static void main(String args[])
{
try
{
Thread t1= new Thread(new RandomThread());
t1.start();
int num=10;
Thread t2=new Thread(new square(num));
t2.start();
Thread t3=new Thread(new cube(num));
t3.start();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
