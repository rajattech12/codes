import java.util.Scanner;
class Fraction{
    int num;
    int den; 
  Fraction(int num, int den){
      this.num = num;
      this.den = den;
      }
      void print(){
          System.out.print(num+" / "+den);
          }
          
         
               void Multiply( Fraction f ){
                 this.num = this.num * f.num;
                 this.den = this.den * f.den;
                  Simplify(); 
                   }
                   void add(Fraction f){
             num = num*f.den + f.num*den;
             den = den*f.den; 
             Simplify();
             }
         void Divide(Fraction f){
             this.num = this.num*f.den;
             this.den = this.den*f.num;
             
             Simplify();
             }
             void Simplify(){
                 boolean isnegative = (num*den < 0) ? true : false;
                 num = Math.abs(num);
                 den = Math.abs(den);
                 int gcd = hcf(num , den);
                 num = num/gcd;
                 den = den/gcd;
                 if(isnegative)
                 num = -num;
                 
                 }
             
             int hcf(int a, int b){
                    if(a==0)  return b;
                    return hcf(b%a , a);
                    }
                    
      
}

public class Fractionclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Fraction Numrator First : ");
		int num1 = sc.nextInt();
		System.out.print("Enter fraction Denomrator First : ");
		int den1 = sc.nextInt();
		System.out.print("Enter Fraction Numrator Second : ");
		int num2 = sc.nextInt();
		System.out.print("Enter Fraction Denomrator Second : ");
		int den2 = sc.nextInt();
		
		Fraction f1 = new Fraction(num1 ,den1);
		Fraction f2 = new Fraction(num2 ,den2);		
	    System.out.print("First Fraction : ");
	    f1.print();
	    System.out.println("");
	    System.out.print("second Fraction : ");
	    f2.print();
	    System.out.println();
	    f1.add(f2);
	    System.out.print("Add Fraction f2 into Fraction f1 :  ");
	    f1.print();
	    System.out.println();
	    f1 = new Fraction(num1 , den1);
	    f1.Multiply(f2);
	    System.out.print("Multiply Fraction f2 into Fraction f1 : ");
	    f1.print();
	    System.out.println("");
	    f1 = new Fraction(num1, den1);
	    f1.Divide(f2);
	    System.out.print("divide fraction f2 into Fraction f1 : ");
	    f1.print();
	         
	           
	}
}