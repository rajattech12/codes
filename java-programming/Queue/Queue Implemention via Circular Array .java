class CircularQueue{
     int[] arr;
    private int f;
    private int r;
    private int size;
    CircularQueue(int capacity){
        arr = new int[capacity];
        }
        void add(int val){
            if(size == arr.length){
                System.out.print("Array is full  ");
                return;
            }
            arr[r++] = val;
            if(r== arr.length) r=0;
            size++; 
    }
    void Display(){
        if(size==0) return;
        if(f>=r){
            for(int i=f; i<arr.length; i++){
                System.out.print(arr[i] +" ");
                }
                for(int i=0; i<r; i++){
                    System.out.print(arr[i] +" ");
                    }
            }
            else{
                for(int i=f; i<r; i++){
                    System.out.print(arr[i]+" ");
                    }
                }
                System.out.println("");
    }
    int peek(){
        if(size == 0){
        System.out.print("Array is Empty");
        return-1;
        }
        return arr[f];
        }
        
     int remove(){
         if(size==0){
         System.out.print("Array is Empty");
         return -1;  
         }
         int frontval = arr[f];
         f++; 
         if(f==arr.length) f=0;
         size--;
        
    return frontval;
}
}    
public class CircularArray {
	public static void main(String[] args) {
	CircularQueue q = new CircularQueue(4);	
		q.add(10); q.add(20); q.add(30); 
	q.Display();
	System.out.println("peek value : "+q.peek()); 
		System.out.println("Remove value : " +q.remove()); 
		q.Display();
		q.add(40);
		q.add(50);
		q.Display();
		int[] a = q.arr;
		for(int ele : a)
		System.out.print(ele + " ");
	}
}
