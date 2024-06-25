package com.collections;

class Node1
{
	int key;
	Node1 next;
	Node1(int key)
	{
		this.key=key;
		this.next=null;
	}
}
public class LinkedListDemoOwn 
{
Node1 head,preNode,temp;
void createList(int key)
{
	Node1 temp=new Node1(key);
	if(head==null)
	{
		head=temp;
		head.next=null;
	}
	if(head!=null&&preNode==null)
	{
		head.next=temp;
		preNode=temp;
		preNode.next=null;
	}
	if(preNode!=null)
	{
		//System.out.println("When adding "+key+"Pre Node key: "+preNode.key);
		preNode.next=temp;
		preNode=temp;
	}
}

void deleteKey(int key)
{
	Node1 temp=head,pre=null;
	if(head!=null&&head.key==key)
	{
		head=head.next;
		return;
	}
	while(temp.key!=key)
	{
		pre=temp;
		temp=temp.next;
	} 
	pre.next=temp.next;
	//System.out.println("inside delete method preNode key: "+preNode.key);
	//System.out.println("inside delete method pre key: "+pre.key);
}
void displayList()
{
	Node1 temp=head;
	while(temp!=null)
	{
		System.out.print(temp.key+" ");
		temp=temp.next;
	}
}
public static void main(String[] args) 
{
	LinkedListDemoOwn obj=new LinkedListDemoOwn();
	obj.createList(1); 
	obj.createList(2); 
	obj.createList(3); 
	obj.createList(4); 
	obj.createList(5);
	
	System.out.println("\nLinked List after adding 1 to 5");
	obj.displayList();
	System.out.println("\nHead Key: "+obj.head.key);
	System.out.println("PreNode Key: "+obj.preNode.key);
	
	System.out.println("\nLinked List after deleting 3");
	obj.deleteKey(3); 
	obj.displayList();
	System.out.println("\nHead Key: "+obj.head.key);
	System.out.println("PreNode Key: "+obj.preNode.key);
	
	obj.createList(6); 
	obj.createList(7);
	System.out.println("\nLinked List after adding 6,7");
	obj.displayList();
	System.out.println("\nHead Key: "+obj.head.key);
	System.out.println("PreNode Key: "+obj.preNode.key);
	
	obj.deleteKey(1); 
	System.out.println("\nLinked List after deleting 1");
	obj.displayList();
	System.out.println("\nHead Key: "+obj.head.key);
	System.out.println("PreNode Key: "+obj.preNode.key);
}
}
