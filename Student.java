package JavaOO;

public class Student {
	String major;
	int num;

	public static void main(String[] args) {
		Student student = new Student();
		student.major = "��ǻ���������а�";
		student.num = 20164127;

		System.out.println("�а� : " + student.major + "\n�й� : " + student.num);
	}

}