import java.util.*;
class Pattern1
{
public int x;
public void abc ()
{
System.out.println("the pattern is");
for(int i=1;i<=x;i++)
{
for(int j=1;j<=x;j++)
{
System.out.print(i);
}
System.out.print("\n");
}
}

public static void main(String args[])
{
Pattern1  a1=new Pattern1();
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int n=sc.nextInt();
a1.x=n;
a1.abc();
}
}