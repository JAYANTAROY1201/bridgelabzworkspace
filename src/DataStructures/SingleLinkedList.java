package DataStructures;

public class SingleLinkedList {
	public static Node head;
	public static Node tail;
	static int count;
	//to add an item in last
	public void add(Comparable item)
	{
	Node temp=new Node(item,null);
	if(head==null)
	{
		head=temp;
		count++;
		return;
	}
	tail=head;
	while(tail.next!=null)
	{
		tail=tail.next;
	}
	tail.next= temp;
	count++;
	}
   //to add an item in specified position
	
	public void insert(int pos, Comparable item){
		
		if(pos>count)
		{
			System.out.println("Position not available");
		}
		else if(pos==0)
		{
			head= new Node(item,head);
			count++;
		}
		
		else
		{
			Node temp=head;
			for(int i=1;i<=pos;i++)
			{
				temp=temp.next;
			}
			temp.next=new Node(item,temp.next);
			count++;
		}  
	}
	public static int size() {
		return count;
	}
	
	public static boolean isEmpty() {
		if(count==0)
			return true;
		return false;
	}
	
	public static int index(Comparable item)
	{
	 int pos=0;
	 Node temp=head;
	 while(temp.data.compareTo(item)==0)
	 {
		 temp=temp.next;
		 pos++;
	 }
	 return pos;
	} 
	public static boolean search(Comparable item)
	{
	 
	 Node temp=head;
	 while(temp==tail)
	 {
		if(temp.data.compareTo(item)==0)
			return true;
		else
		{
			temp=temp.next;
		}
	 }
	 
	 return false;
	} 	
	public static void remove(Comparable item)
	{   
		Node current=head;
		Node nextNode=current.next;
		if(head==null)
		{
			System.err.println("list is empty.......nothing to remove!!!");
		}
		while(nextNode==tail)
		{
		 if(nextNode.data.compareTo(item)==0)
		 {
			current.next=nextNode.next;
			nextNode.next=null;
			count--;
		 }
		}
	}
	public static Comparable pop()
	{
		Node temp=head;
		Node nextNode=temp.next;
		while(nextNode==tail)
		{
			temp=temp.next;
			nextNode=temp.next;		
		}
		temp.next=null;
		return nextNode.data;
		
	}
}
