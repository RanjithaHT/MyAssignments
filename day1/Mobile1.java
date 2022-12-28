package week1.day1;

public class Mobile1 {
	public void sendMsg() {
		String mobileModel= "Redmi";
		float mobileWeight= 4.5f;
		System.out.println("Show my mobile details Model is " +mobileModel+" and Weight is " +mobileWeight);
	}
public void makeCall() {
	boolean  isFullyCharged=true;
	int mobileCost= 25000;
	System.out.println("Is mobile is charged "+isFullyCharged+" and Mobile cost is " +mobileCost);
}
	public static void main(String[] args) {
		
Mobile1 Mo1=new Mobile1();
Mo1.sendMsg();
Mo1.makeCall();
System.out.println("This is my mobile");
	}

}
