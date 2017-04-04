package obj.field;

public class Circle {
	public double radius;
	public static final double PI = 3.141592;
	
	//������ ����
	public Circle(double radius) {
		this.radius = radius;
	}
	//���� �������� ����Ͽ� ���� ������ ���ϴ� �޼ҵ�
	public double getArea() {
		return radius * radius * PI;
	}
	//���� �������� ����Ͽ� ���� �ѷ� ���̸� ���ϴ� �޼ҵ�
	public double getCircumference() {
		return 2 * PI * radius;
	}

	//�ֿ� ���� ���
	public void print() {
		System.out.printf("�������� %.2f�� ���� ������ %.2f�̰�,", radius, getArea());
		System.out.printf(" �ѷ� ���̴� %.2f�̴�. %n", getCircumference());
	}

	public static void main(String[] args) {	
		Circle c1 = new Circle(2.8);
		c1.print();
		
		Circle c2 = new Circle(5.6);
		c2.print();
	}
}
