package java9HomeWork;

public class TestPassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);
		
		int n = 5;//main()中的一个局部变量
		printAreas(myCircle,n);
		
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);  //值传递形参的改变不会影响实参的值

	}
	
	public static void printAreas(CircleWithPrivateDataFields c,int times) {
		System.out.println("Radius \t\tArea");
		while(times >= 1) {
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}

}
