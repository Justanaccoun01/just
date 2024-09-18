package just;


 class Figure{
	double a,b;
	
	 void area() {
		 System.out.println("Area of super class "+a*b);
	 }
}
 class Rect extends Figure{
	
	 
	 void inp(double a, double b) {
		 super.a = a;
		 super.b = b;
	 }
	 void area() {
		 System.out.println("Area of Rectangle is " + (a*b));
	 }
 }
 class Tri extends Figure{
	
	 void inp(double a, double b) {
		 super.a = a;
		 super.b = b;
	 }
	 void area() {
		 System.out.println("Area of Triangle is "+(0.5*a*b));
		 
	 }
 }

public class Run {
 public static void main(String args[]) {
	Figure figref;
    
	Rect  r = new Rect();   
    r.inp(3.0,5.0);
    figref= r;
    figref.area();
    
    Tri t = new Tri();
    t.inp(3.5,4.5);
    figref = t;
    figref.area();
    
    figref = new Figure();
    figref.area();
    
}
}
