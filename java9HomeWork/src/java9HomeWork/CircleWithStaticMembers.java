package java9HomeWork;

public class CircleWithStaticMembers {
	double radius;
	static int numberOfObjects = 0; //æ≤Ã¨±‰¡ø
	CircleWithStaticMembers(){
		radius = 1;
		numberOfObjects++;
	}
	CircleWithStaticMembers(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	static int getNumberOfObject() {
		return numberOfObjects;
	}
	double getArea() {
		return radius * radius * Math.PI;
	}

}
