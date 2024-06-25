package com.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		ArrayList<StudentRecord> list=new ArrayList<StudentRecord>();
		int choice=0;
		System.out.println("STUDENTS RECORDS");
		Scanner scan=new Scanner(System.in);
		do
		{
		System.out.println("\n\n1.Add Student\n2.View Student\n3.Update Student\n4.Delete Student\n5. Sort by Roll No\n6. Sort by Name\n7.Exit");
		System.out.print("Enter your choice: ");
		choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.print("\nEnter Student Roll No: ");
			int rollNo=scan.nextInt();
			System.out.print("Enter Student Name: ");
			String name=scan.next();
			System.out.print("Enter mark 1: ");
			int m1=scan.nextInt();
			System.out.print("Enter mark 2: ");
			int m2=scan.nextInt();
			System.out.print("Enter mark 3: ");
			int m3=scan.nextInt();
			StudentRecord obj=new StudentRecord();
			obj.addStudent(rollNo, name, m1, m2, m3); 
			list.add(obj);
			System.out.println("Student Records added successfully");
			break;
		
		case 2:
			System.out.println("\nRollNo\tName\tMark1\tMark2\tMark3\tTotal\tAverage");
			for(int i=0;i<list.size();i++)
				list.get(i).viewStudent(list.get(i));  
			break;
		
		case 3:
			System.out.print("\nEnter Student Roll No to update: ");
			int studRollNo=scan.nextInt();
			int errCount=0;
			for(int i=0;i<list.size();i++)
			{
				if(studRollNo==(list.get(i).rollno))
				{
					list.get(i).updateStudent(list.get(i));
					System.out.println("Student details updated successfully");
					errCount++;
					break;
				}
			}
			if(errCount==0)
				System.out.println("Student Roll No does not exist in records");
			break;
			
		case 4:
			System.out.print("\nEnter Student name to delete record: ");
			String studName=scan.next();
			int errCount1=0;
			for(int i=0;i<list.size();i++)
			{
				if(studName.equals(list.get(i).name))
				{
					list.remove(list.get(i));
					errCount1++;
					System.out.println("Student record has been deleted");
					break;
				}
			}
			if(errCount1==0)
				System.out.println("Student name does not exist in records");
			break;
			
		case 5:
			//Collections.sort(list, new StudentComparatorByRollNo());  
			list.sort(Comparator.comparingInt(StudentRecord::getRollNo));
			System.out.println("\nRollNo\tName\tMark1\tMark2\tMark3\tTotal\tAverage");
			for(int i=0;i<list.size();i++)
				list.get(i).viewStudent(list.get(i)); 
			break;
			
		case 6:
			//Collections.sort(Comparator.comparing(StudentRecord::getName));
			list.sort(Comparator.comparing(StudentRecord::getName));
			System.out.println("\nRollNo\tName\tMark1\tMark2\tMark3\tTotal\tAverage");
			for(int i=0;i<list.size();i++)
				list.get(i).viewStudent(list.get(i)); 
			break;
		}
		}while(choice!=7);
	scan.close();
	}

}
