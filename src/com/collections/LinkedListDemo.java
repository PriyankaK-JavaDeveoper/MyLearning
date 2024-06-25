package com.collections;

class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class LinkedListDemo {
	Node head;
	public LinkedListDemo()
	{
		head=null;
	}
	void insertBegin(int data)
	{
		Node node=new Node(data);
		node.next=head;
		head=node;
	}
	void insertAfter(Node preNode,int data)
	{
		if(preNode==null)
		{
			System.out.println("Previous Node is Empty");
			return;
		}
		Node node=new Node(data);
		node.next=preNode.next;
		preNode.next=node;
	}
	void insertEnd(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			return;
		}
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=node;
	}
	void delete(int key)
	{
		Node temp=head;
		Node preNode=null;
		if(temp!=null&&temp.data==key)
		{
			head=temp.next;
			return;
		}
		while(temp!=null&&temp.data!=key)
		{
			preNode=temp;
			temp=temp.next;
		}
		preNode.next=temp.next;
		if(temp==null)
			return;
	}
	
	void printSet()
	{
		Node current=head;
		System.out.println("Linked List");
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String[] args) {
		LinkedListDemo obj=new LinkedListDemo();
		obj.insertBegin(1); 
		obj.insertEnd(2);
		obj.insertAfter(obj.head.next, 3);
		System.out.println("Before Deletion");
		obj.printSet();
		obj.delete(2);
		System.out.println("\n\nAfter Deletion");
		obj.printSet();
	}

}
