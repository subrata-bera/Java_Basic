
import java.util.Scanner;
class Patern
{
	public void star(int t)
	{
		System.out.println("the folloing paterns");
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=t;j++)
			{
			System.out.print("\t"+i);
			}
			System.out.print("\n");
		} 
	}
public static void main(String args[])
{
Patern obj=new Patern();
System.out.println("enter line");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
obj.star(n);
}
}
