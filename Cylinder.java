package JavaOO;

public class Cylinder {
	public Circle c;
	public double height;
	
	public double getVolume() {
		return c.getArea() * height;
	}
	
	public static void main(String[] args) {
		Cylinder cd = new Cylinder();
		cd.c = new Circle(2.8);
		cd.height = 5.6;
		System.out.println(cd.getVolume());
	}

}
