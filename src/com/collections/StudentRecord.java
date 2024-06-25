package com.collections;

import java.util.Scanner;

public class StudentRecord {
int rollno;
String name;
int m1,m2,m3;
int total;
float average;
public String getName()
{
	return this.name;
}
public int getRollNo()
{
	return this.rollno;
}
public void addStudent(int rollno,String name,int m1,int m2,int m3)
{
	this.rollno=rollno;
	this.name=name;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	this.total=calculateTotal(this.m1,this.m2,this.m3);
	this.average=calculateAverage(this.total);
}

public int calculateTotal(int mark1,int mark2,int mark3)
{
	int total=mark1+mark2+mark3;
	return total;
}

public float calculateAverage(int total)
{
	float avg=total/3;
	return avg;
}

public void viewStudent(StudentRecord obj)
{
	System.out.println(obj.rollno+"\t"+obj.name+"\t"+obj.m1+"\t"+obj.m2+"\t"+obj.m3+"\t"+obj.total+"\t"+obj.average);
}

public void updateStudent(StudentRecord obj)
{
	int mark1=0,mark2=0,mark3=0,choice=0;
	Scanner scan=new Scanner(System.in);
	do 
	{
	System.out.println("\n1.Mark1\t2.Mark2\t3.Mark3\t4.Stop Updation");  
	System.out.print("Please select which marks to update: ");
	choice=scan.nextInt(); 
	switch(choice)
	{
	case 1:
	System.out.print("Enter mark 1 to update: ");
	mark1=scan.nextInt();
	obj.m1=mark1;
	break;
	
	case 2:
	System.out.print("Enter mark 2 to update: ");
	mark2=scan.nextInt();
	obj.m2=mark2;
	break;
	
	case 3:
	System.out.print("Enter mark 3 to update: ");
	mark3=scan.nextInt();
	obj.m3=mark3;
	break;
	}
	}while(choice!=4);
	obj.total=calculateTotal(obj.m1,obj.m2,obj.m3);
	obj.average=calculateAverage(obj.total);	
}
}
