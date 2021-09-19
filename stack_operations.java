import java.util.Scanner;
public class stack_operations
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter Size of stack:");
int n=scanner.nextInt();
Stack s=new Stack(n);
int item;
while(true)
{
System.out.println("Enter your Choice:");
System.out.println("1.Push\n2.Pop\n3.Display");
int ch=scanner.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the element to be inserted:");
item=scanner.nextInt();
s.push(item);
break;
case 2:
item=s.pop();
if(item!=0)
    System.out.println("Poped element is:"+item);
break;
case 3:
s.show();
break;
default:System.exit(0);
}
}
}
}
class Stack
{
int a[];
int top;
public Stack(int n)
{
a=new int[n];
top=-1;
}
void push(int n)
{
if(top==a.length-1)
    System.out.println("Stack overflow");
else
    a[++top]=n;
}
int pop()
{
if(top==-1)
{
System.out.println("Stack underflow");
return 0;
}
else 
    return(a[top--]);
}
void show()
{
if(top==-1)
    System.out.println("stack Empty");
else
{
System.out.println("stack elements are:");
for(int i=top;i>=0;i--)
    System.out.println(a[i]);
}
}
}