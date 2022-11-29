package dy1129;
// 설계도
public class Person {
	// 1. 필드
	private String name;
	private String addr;
	private String phone;
	
	// 2. 생성자
	public Person(){}; // 기본생성자  	
	public Person(String name, String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.addr = phone;
	}
	// 3. 메소드
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString(); 
	}
}
class Student extends Person{
	// 1. 필드
	private int stuId;
	private String jeongong;
	// 2. 생성자.
	public Student() {};
	public Student(String name, String addr, String phone, int stuId, String jeongong) {
		super(name, addr, phone);
		this.stuId = stuId;
		this.jeongong = jeongong;
	}
	//3. 메소드
	public int getstuId() {
		return stuId;
	}
	
	public String getJeongong() {
		return jeongong;
	}
	
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	
	public void setJeongong(String jeongong) {
		this.jeongong = jeongong;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString() + "학번:" + stuId + " , major:" + jeongong;
}
}
