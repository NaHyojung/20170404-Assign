package JavaOO;

public class Student2 {
	private String major;
	private int num;
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getNum(){
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.setMajor("컴퓨터정보공학과");
		s.setNum(20164127);
		System.out.println(s.getMajor()+" "+s.getNum());

	}

}
