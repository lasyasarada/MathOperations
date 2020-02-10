import java.lang.*;
import java.util.Scanner;
abstract class Operation{
	abstract void getResult(int a,int b);
	// void subtract(int a,int b);
	// void multipy(int a,int b);
	// void division(int a,int b);
}
class Add extends Operation{
	void getResult(int a,int b){
		System.out.println("Solution="+(a+b));
	}
}
class Subtract extends Operation{
	void getResult(int a,int b){
		System.out.println("Solution="+(a-b));
	}
}
class Multiply extends Operation{
	void getResult(int a,int b){
		System.out.println("Solution="+(a*b));
	}
}
class Division extends Operation{
	void getResult(int a,int b){
		System.out.println("Solution="+(a/b));
	}
}
class MathOperations{
	public static void main(String args[]){
		//Operation o=new Operation();
		Operation o;
		Scanner input=new Scanner(System.in);
		System.out.print("a=");
		int a=input.nextInt();
		System.out.print("b=");
		int b=input.nextInt();
		System.out.println("Enter 1.Addition 2.Subtraction 3.Multiplication 4.Division");
		int m=input.nextInt();
	
		if (m==1){
			o=new Add();
			o.getResult(a,b);
		}
		else if(m==2){
			o=new Subtract();
			o.getResult(a,b);
		}
		else if(m==3){
			o=new Multiply();
			o.getResult(a,b);
		}
		else if(m==4){
			o=new Division();
			o.getResult(a,b);
		}
		else{
			System.out.println("Enter a valid number(1-4)");
		}
	}
}
