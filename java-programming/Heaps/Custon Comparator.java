import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;
    Student(String name, int rno, double cgpa){
       this.name = name;
       this.rno = rno;
       this.cgpa = cgpa;
         }
         public int compareTo(Student s) {
             return  Double.compare(this.cgpa,s.cgpa);  
             //this.name.compareTo(s.name;
             }
    }
public class CustonComparator {
	public static void main(String[] args) {
		Student s1 = new Student("todia",48,8.1);
		Student s2 = new Student("raju",56,7.8);
		Student s3 = new Student("ankit",78,9.9);
		Student s4 = new Student("jayant",46,4.7);
		Student s5 = new Student("kumar",75,6.3);
		Student s6 = new Student("aditya",52,8.3);
		Student[] arr = {s1,s2,s3,s4,s5,s6};
		Arrays.sort(arr);
		for(Student s : arr){
		    System.out.println(s.name + " "+s.rno+" "+s.cgpa);
		    }		
	}
}