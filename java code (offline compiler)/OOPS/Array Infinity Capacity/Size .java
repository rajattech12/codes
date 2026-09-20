class ArrayList{
    int[] arr;
    int idx =0;
    int size = 0;
    ArrayList(int Capacity ){
       arr = new int[Capacity];
        }
        void display(){
            for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
            }
            System.out.println("");
        }
        int Capacity(){
            return arr.length;
            }
            void add(int ele){
                if(idx == arr.length)
                IncreaseCapacity();
                arr[idx] = ele;
                idx++;
                size++;
                }
                void IncreaseCapacity(){
                    int[] arr2 = new int[arr.length*2];
                    for(int i=0; i<arr.length; i++){
                        arr2[i] = arr[i];
                        }
                        arr = arr2;
                    }
    }
public class ArrayInfinintyaCapacity {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList(1);
	    arr.add(10); arr.add(20); arr.add(30);
	    arr.display();
	    arr.add(10); arr.add(20); arr.add(30);
	    arr.display();
        System.out.println("");
        System.out.print("Array Capacity : "+ arr.Capacity());	
	}
}