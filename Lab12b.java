import java.util.Scanner;
import java.io.*;
class cbr
{
int a,b;
	 void read(cbr c)
	{
	c.a=c.a+10;
        c.b=c.b+10;
	}
}
class Lab12b
{
public static void main(String... ar)
{
cbr c=new cbr();
Scanner s=new Scanner(System.in);
System.out.println("enter a value:");
c.a=s.nextInt();
System.out.println("enter b value:");
c.b=s.nextInt();
System.out.println("before the a and b values are :"+c.a+","+c.b);
c.read(c);
System.out.println("after the a and  b values are :"+c.a+","+c.b);
}
}