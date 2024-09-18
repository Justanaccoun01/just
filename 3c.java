package just;


class Student{
    String name;
    int regno;

  void getData(String sname, int rno) {
	name = sname;
	regno =rno;
  }
  void putData() {
		System.out.println("Name:"+ name+ "\nRegno:"+regno);
	}
  
}
interface S{
    int pract_mark =60;
}

class Mark extends Student{
	int m1,m2,m3;
	
	void getMarks(int m1,int m2,int m3) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	void putMarks() {
		System.out.println("M1:" +m1 +" M2:" +m2 + " M3: "+m3 );
	}
}

class Result extends Mark implements S   {
	int total;
	
	void getmarks(int a, int b , int c) {
		super.getMarks(a,b,c);
	}
	void display() {
		putData();
		putMarks();
		System.out.println("Practical Mark: "+pract_mark);
		System.out.println("Total Marks: " + (m1+m2+m3));
		
		int a[] = {m1,m2,m3};
		for(int i = 0; i<3; i++) {
			if(a[0] > 50) {
				System.out.println("M" +(i+1) +"passed");
			}
		}
	}
}
public class New {
	public static void main (String args[]) {
	Result r = new Result();
	r.getData("M.SENTHILKUMAR", 1001);
	
	r.getmarks(98,99,100);
	
	r.display();
	

}
}

