public class StackLL
{
    //creating a linked List 
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    //creating stack
    static class Stack{
        public static Node head = null;
        //Checking stack is Empty or Not
        public static boolean isEmpty(){
            return head == null;
        }
        //push mehtod
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
            }
            newNode.next = head;
            head = newNode;
        }
        //Pop method
        public static int pop(){
            int pop = head.data;
            head = head.next;
            return pop;
        }
        //peak method
        public static int peak(){
            return head.data;
        }
        
    }
	public static void main(String[] args) {
	    Stack stack = new Stack();
	    stack.push(1);
	    stack.push(2);
	    stack.push(3);
	    System.out.println(stack.peak());
	    System.out.println(stack.pop());
	    System.out.println(stack.peak());
	}
}
