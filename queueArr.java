public class queueArr
{
    static class queue{
        static int [] arr;
        static int size;
        static int rear;
        
        queue(int n){
            arr = new int [n];
            this.size = n;
            rear =-1;
        }
        
        public static boolean isEmpty(){
            return rear==-1;
        }
    
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return; 
            }
            rear++;
            arr[rear]=data;
            
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peak(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            return front;
        }
    }
	public static void main(String[] args) {
		queue q = new queue(6);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		
		while(!q.isEmpty()){
		    System.out.println(q.peak());
		    q.remove();
		}
	}
}
