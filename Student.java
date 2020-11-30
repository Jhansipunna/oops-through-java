import java.util.Scanner;
class Student
{
int Sno;
String Sname;
Student()
{
Sno=1;
Sname="rama";
}
Student(int sno,String sname)
{
this.Sno=sno;
this.Sname=sname;
}
void display()
{
System.out.println(Sno+Sname);
}
public static void main(String args[])
{
Student s=new Student();
s.display();
Student S1=new Student(3,"sita");
S1.display();
Scanner ob=new Scanner(System.in);
int sno2=ob.nextInt();
String Sname2=ob.next();
Student S3=new Student(sno2,Sname2);
S3.display();
}
}
