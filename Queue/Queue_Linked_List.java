package queue;

public class Queue_Linked_List {
	
	private Node head;
	private Node tail;
	
	public class Node {
		
		public String data;
		public Node next;
		
		Node(String s){
			data=s;
		}

		public void print_Data(){
			System.out.print(data+" ");
		}
	}
	
	Queue_Linked_List(){
		head=null;
		tail=null;
	}
	
	public void enqueue(String s){
		Node current=new Node(s);
		if (tail!=null)
			tail.next=current;
		tail=current;
		tail.next=null;
		if (head==null)
			head=tail;
		
	}
	
	public void dequeue(){
		
		if (head!=null && tail!=null){
			Node current;
			current= head.next;
			System.out.println("\nDequeued element is"+head.data);
			head=current;
		}
		else{
			System.out.println("\nNo element to delete");
		}
		
	}
	
	public void print_Elements_From_Head(){
		Node pointer;
		pointer=head;
		
		while(pointer!=null){
			pointer.print_Data();
			pointer=pointer.next;

		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue_Linked_List q=new Queue_Linked_List();
		q.enqueue("Nissan");
		q.enqueue("Honda");
		q.enqueue("BMW");
		q.enqueue("Mercedes");
		q.enqueue("Jeep");
		q.enqueue("Wrangler");		
		q.print_Elements_From_Head();
		q.dequeue();
		q.print_Elements_From_Head();
		q.print_Elements_From_Head();
		q.dequeue();
		q.dequeue();
		q.print_Elements_From_Head();
		System.out.println("\n"+q.head.data);
		System.out.println("\n"+q.tail.data+"\n");
	}

}
