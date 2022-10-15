import java.util.*;
    
    public class stackAA{
        ArrayList<Integer> List = new ArrayList<>();
        
        
        boolean isEmpty(){
            
            return List.size()==0;
        }
        
        public  void push(int data){
            List.add(data);
        }
        
        public  int pop(){
            if(isEmpty()){
                return -1;
            }
            int pop = List.remove(List.size()-1);
            return pop;
        }
        
        public  int peak(){
            if(isEmpty()){
                return -1;
            }
            int peak = List.get(List.size()-1);
            return peak;
            
        }
    
    
	public static void main(String[] args) {
		stackAA s = new stackAA();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s.peak());
		System.out.println(s.pop());
		System.out.println(s.peak());
		
		
	}
    }
