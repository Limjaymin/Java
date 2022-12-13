package dy1213;
// 설계도
public class Phone {
	//공유
	static int count;
	//1.필드
	private String name;
	private int maker;
	private int price;
	//2.생성자              // 생성자 및 메소드 자동생성가능.   생성자 생성  1. 마우스 우클릭 2. source
	public Phone() {count++;};
	public Phone(String name, int maker, int price) {
		super();
		this.name = name;
		this.maker = maker;
		this.price = price;
		count++;
	}
	//3. 메소드 getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaker() {
		return maker;
	}
	public void setMaker(int maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", maker=" + maker + ", price=" + price + "]";
	}
}

