package dy1213;

public class SmartPhone extends Phone implements PhoneInterface{
	// 반드시 구현해줘야하는 것이 있다.
	// 1. 필드
	private int osType; // 안드로이드 1
	private int memSize; 
	
	// 2. 생성자
	public SmartPhone() {
		super();
	}
	public SmartPhone(String name, int maker, int price, int osType, int memSize) {
		super(name, maker, price);
		this.osType = osType;
		this.memSize = memSize;
	}
	
	// 3. 메소드
	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("전화겁니다. 따르르르릉");
	}
	
	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화왔어요..");
	}
	
	public int getOsType() {
		return osType;
	}
	public void setOsType(int osType) {
		this.osType = osType;
	}
	public int getMemSize() {
		return memSize;
	}
	public void setMemSize(int memSize) {
		this.memSize = memSize;
	}
	
	@Override
	public String toString() {
		return super.toString() + "SmartPhone [osType=" + osType + ", memSize=" + memSize + "]";
	}
	
}
