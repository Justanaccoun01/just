package just;
import java.util.*;

abstract class Calculator{
	
	int n1,n2;
	Calculator(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	
	abstract int calculate();
            
}
class Sub extends Calculator{
	Sub(int n1,int n2){
		super(n1,n2);
	}

	
	int calculate() {
		return n1-n2;
                  		
	}
}
class Addition extends Calculator{
	Addition(int n1, int n2){
		super(n1,n2);
	}
	int calculate() {
		return n1+n2;
	}
}

class Division extends Calculator{
	Division(int n1, int n2){
		super(n1,n2);
	}
	int calculate() {
		return n1/n2;
	}
}


class Multiplication extends Calculator{
	Multiplication( int n1, int n2){
		super(n1,n2);
	}
	int calculate() {
		return n1*n2;
	}
}
public class Abstract {
	public static void main(String args[]) {
		
	
	Scanner s = new Scanner(System.in);
	
	
	
	System.out.println("Enter the number1:");
	int n1 = s.nextInt();
	
	System.out.println("Enter the number2:");
	int n2 = s.nextInt();
	
	System.out.println("Enter the operator:");
	String op = s.next();
	int ans = 0;
	switch(op) {
	
	case "+" :
		Addition a = new Addition(n1,n2);
		ans = a.calculate();
		break;
		
	case "-":
		Sub sub = new Sub(n1,n2);
		ans  = sub.calculate();
		break;
	
	
	case "/":
		Division d = new Division(n1,n2);
		ans = d.calculate();
	break;
	case "*":
		Multiplication m = new Multiplication(n1,n2);
		 ans = m.calculate();
		 break;
	}
	
	
	System.out.println("Answer = "+ans);
	
	s.close();
	}
}







