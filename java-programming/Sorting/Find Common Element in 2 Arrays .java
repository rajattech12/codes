import java.util.*;
public class CommonElement {
	public static ArrayList<Integer> CommonElement(int[] a , int[] b){
	    Arrays.sort(a);
	    Arrays.sort(b);
	    ArrayList list = new ArrayList<>();
	    int i=0, j=0;
	    while(i<a.length && j<b.length){
	        if(a[i] == b[j]){
	          list.add(a[i]);
	          i++;
	          j++;
	        }
	          else if(a[i] > b[j])
	             j++;
	             else i++; 
	            }
	            return list;
	    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Size of Ist Array : ");
	    int n = sc.nextInt();
	    System.out.print("Size of second Array : ");
	     int m = sc.nextInt();
	    
	     int[] a = new int[n];
	     int[] b = new int[m];
	     for(int i=0; i<a.length; i++){
	         System.out.print("Enter " +(i+1)+ " Element of Ist Array : ");
	         a[i] = sc.nextInt();
	         }
	         for(int i=0; i<b.length; i++){
	             System.out.print("Enter "+(i+1)+" Element of Second Array : ");
	             b[i] = sc.nextInt();
        }
        System.out.print("Elements of Ist Array : ");
          for(int i=0; i<a.length; i++){
                      System.out.print(a[i]+ " ");                                                                                                  
           }
           System.out.println("");
           
           System.out.print("Elements of Second Array : ");
           for(int i=0; i<b.length; i++){
                     System.out.print(b[i]+" ");       
                     }
                     System.out .println();
                     ArrayList<Integer> list =  CommonElement(a,b);
                  
                  System.out.print("Common Element : " + list);
                                                                                                                                                   
  }
}