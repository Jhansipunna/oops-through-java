import java.util.*;
interface Student
{
 void name(int no,String name,int age);
}
interface Depertment
{
 void cource(String cource);
}
interface Attandance extends Student,Depertment
{
 void Attend(int attendance);
}
class Lab17 implements Attendance
{
 public void name(int no,String name,int age)
 {
  System.out.println("roll no :"+no);
  System.out.println("student name :"+name);
  System.out.println("student age :"+age);
 }
 public void cource(String cource)
 {
  System.out.println("student cource :"+cource);
 }
 public void Attend(int attendance)
 {
  System.out.println("attendance is :"+attendance);
  if(attendance>=75)
  System.out.println("he is eligible for exams");
  else
  System.out.println("he is not eligible for exams");
 }
 public static void main(String args[])
 {
  Lab17 e=new Lab17();
  e.name(84,"vasu",23);
  e.cource("mca");
  e.Attend(80);
  Lab17 e1=new Lab17();
  e1.name(1,"teja",21);
  e1.cource("mca");
  e1.Attend(60);
 }
}
